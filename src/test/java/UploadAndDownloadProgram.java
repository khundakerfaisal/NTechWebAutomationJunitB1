import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class UploadAndDownloadProgram {
    WebDriver driver;

    @BeforeEach
    public void StartBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Order(1)
    @Test
    public void ScreenShot() throws InterruptedException, IOException {
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String filePath ="C:/Users/akm.faisal/Downloads/UploadFile" + System.currentTimeMillis() + ".png";

        File destFile = new File(filePath);
        FileUtils.copyFile(srcFile, destFile);

        Thread.sleep(2000);
        System.out.println("screenshot test completed!");


    }
    @Order(2)
    @Test
    public void uploadFile() throws InterruptedException, IOException {
        driver.get("https://demoqa.com/upload-download");
        Thread.sleep(1000);
        WebElement uploadItem=driver.findElement(By.id("uploadFile"));
        uploadItem.sendKeys("C:\\Users\\akm.faisal\\Downloads\\UploadFile1777984403118.png");
        Thread.sleep(4000);
        System.out.println("screenshot test completed!");
        Thread.sleep(5000);

    }
    @Order(3)
    @Test
    public void downloadFile() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement clickDownloadButton=driver.findElement(By.id("downloadButton"));
        clickDownloadButton.click();
        Thread.sleep(500);

    }

    @AfterEach
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }
}
