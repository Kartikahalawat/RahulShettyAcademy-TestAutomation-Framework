import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        int linkCount = driver.findElements(org.openqa.selenium.By.tagName("a")).size();
        System.out.println("Number of links: " + linkCount);

    }
}
