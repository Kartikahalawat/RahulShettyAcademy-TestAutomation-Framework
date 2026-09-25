import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformScrolling {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 600 pixels
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000); // Wait for 3 seconds to see scrolling effect

        // Scroll within a table
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        Thread.sleep(3000); // Wait for 3 seconds to see scrolling effect in the table
    }
}
