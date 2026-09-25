import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class PerformScrolling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");

            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll down by 600 pixels
            js.executeScript("window.scrollBy(0,600)");
            Thread.sleep(3000);

            // Scroll within table
            js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
            Thread.sleep(3000);

            // Handling table grids
            List<WebElement> values =
                    driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

            int sum = 0;

            for (WebElement value : values) {
                sum += Integer.parseInt(value.getText());
            }

            System.out.println("Total calculated value: " + sum);

            int total = Integer.parseInt(
                    driver.findElement(By.className("totalAmount"))
                            .getText()
                            .split(":")[1]
                            .trim()
            );

            System.out.println("Total displayed value: " + total);

            // Validation
            Assert.assertEquals(total, sum);

            System.out.println("=================================");
            System.out.println("TEST PASSED");
            System.out.println("=================================");

        } catch (AssertionError e) {

            System.out.println("=================================");
            System.out.println("TEST FAILED");
            System.out.println("Expected: " + e.getMessage());
            System.out.println("=================================");

        } finally {
            driver.quit();
        }
    }
}