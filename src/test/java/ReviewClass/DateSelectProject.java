package ReviewClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DateSelectProject {
    @Test
    public void selectDate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        WebElement inputDate=driver.findElement(By.id("datePickerMonthYearInput"));
        inputDate.sendKeys(Keys.CONTROL+"a");
        inputDate.sendKeys(Keys.BACK_SPACE);

        //Current date selection
        LocalDate date=LocalDate.now();
        inputDate.sendKeys(date.toString());
        inputDate.sendKeys(Keys.ENTER);
        Thread.sleep(3000);



    }


}
