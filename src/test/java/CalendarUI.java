import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CalendarUI {

    public static void main(String[] args) throws InterruptedException {

        String monthNumber = "6";
        String date = "15";
        String year = "2027";

        WebDriver driver = new ChromeDriver();

        // Open application
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        // --------------------------------------------------
        // 1. Open Calendar
        // --------------------------------------------------

        driver.findElement(
                By.cssSelector(".react-date-picker__inputGroup")
        ).click();


        // --------------------------------------------------
        // 2. Click Month-Year label
        // --------------------------------------------------

        driver.findElement(
                By.cssSelector(".react-calendar__navigation__label")
        ).click();


        // --------------------------------------------------
        // 3. Click Year label
        // --------------------------------------------------

        driver.findElement(
                By.cssSelector(".react-calendar__navigation__label")
        ).click();


        // --------------------------------------------------
        // 4. Select Year
        // --------------------------------------------------

        driver.findElement(
                By.xpath("//button[text()='" + year + "']")
        ).click();


        // --------------------------------------------------
        // 5. Select Month
        // --------------------------------------------------

        List<WebElement> months = driver.findElements(
                By.cssSelector(
                        ".react-calendar__year-view__months__month"
                )
        );

        System.out.println("Number of month elements found: "
                + months.size());

        months.get(Integer.parseInt(monthNumber) - 1).click();


        // --------------------------------------------------
        // 6. Select Date
        // --------------------------------------------------

        driver.findElement(
                By.xpath("//abbr[text()='" + date + "']")
        ).click();

        Thread.sleep(3000); // Wait for 3 seconds to ensure the date is selected


        // --------------------------------------------------
        // 7. Validate Selected Date
        // --------------------------------------------------

        WebElement monthInput = driver.findElement(
                By.cssSelector(
                        ".react-date-picker__inputGroup__month"
                )
        );

        WebElement dayInput = driver.findElement(
                By.cssSelector(
                        ".react-date-picker__inputGroup__day"
                )
        );

        WebElement yearInput = driver.findElement(
                By.cssSelector(
                        ".react-date-picker__inputGroup__year"
                )
        );


        String actualMonth = monthInput.getAttribute("value");
        String actualDay = dayInput.getAttribute("value");
        String actualYear = yearInput.getAttribute("value");


        System.out.println("Expected Month : " + monthNumber);
        System.out.println("Actual Month   : " + actualMonth);

        System.out.println("Expected Day   : " + date);
        System.out.println("Actual Day     : " + actualDay);

        System.out.println("Expected Year  : " + year);
        System.out.println("Actual Year    : " + actualYear);


        // --------------------------------------------------
        // 8. Assertions
        // --------------------------------------------------

        Assert.assertEquals(
                actualMonth,
                monthNumber,
                "Month selection is incorrect"
        );

        Assert.assertEquals(
                actualDay,
                date,
                "Date selection is incorrect"
        );

        Assert.assertEquals(
                actualYear,
                year,
                "Year selection is incorrect"
        );


        System.out.println("Calendar date validation PASSED");


        // Close browser
        driver.quit();
    }
}