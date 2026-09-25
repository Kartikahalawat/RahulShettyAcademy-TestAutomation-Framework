import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        int footerLinkCount = footerDriver.findElements(By.tagName("a")).size();
        System.out.println("Number of links in footer: " + footerLinkCount);

        // Limiting the scope to first column of footer
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int columnLinkCount = columnDriver.findElements(By.tagName("a")).size();
        System.out.println("Number of links in first column of footer: " + columnLinkCount);

        //Opening each link in the first column of footer in a new tab and check if the pages are opening
        for (int i = 1; i < columnLinkCount; i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
        }

        //Getting title of each page opened in new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }

    }
}
