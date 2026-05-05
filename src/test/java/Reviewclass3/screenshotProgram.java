package Reviewclass3;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class screenshotProgram {
    WebDriver driver;

    @BeforeAll
    public void StartBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //    @Order(1)
    @Test
    public void ScreenShot() throws InterruptedException, IOException {
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

//        Random randNumber = new Random();
//        int generateNumber = randNumber.nextInt(500);
        String filePath = "C:/Users/akm.faisal/Downloads/UploadFile_" + System.currentTimeMillis() + ".png";

        File destFile = new File(filePath);
        FileUtils.copyFile(srcFile, destFile);

        Thread.sleep(2000);
        System.out.println("screenshot test completed!");


    }

//    @Order(2)
//    @Test
//    public void checkBox() throws InterruptedException {
//
//        driver.get("https://demoqa.com/checkbox");
//
//        Thread.sleep(1000);
//
//
//        List<WebElement> homeCheckbox = driver.findElements(By.cssSelector(".rc-tree-checkbox"));
//        homeCheckbox.get(0).click();
//
//        Thread.sleep(2000);
//
//        System.out.println("Checkbox test completed!");
//
//    }
//    @Order(3)
//    @Test
//    public void selectDate() throws InterruptedException {
//
//        driver.get("https://demoqa.com/date-picker");
//
//        Thread.sleep(2000);
//
//        WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
//        selectDate.sendKeys(Keys.CONTROL+"a");
//        selectDate.sendKeys(Keys.BACK_SPACE);
//
//        Thread.sleep(2000);
//        LocalDate date=LocalDate.now();
//        selectDate.sendKeys(date.toString());
//        Thread.sleep(2000);
//
//        System.out.println("Checkbox test completed!");
//
//    }

    @AfterAll
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }
}