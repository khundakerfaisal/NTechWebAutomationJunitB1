import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UploadAndDownload {

    public WebDriver driver;

    @BeforeAll
    public void startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @DisplayName("Upload File")
    @Test
    @Order(1)
    public void uploadFile() throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();

        Thread.sleep(4000);
        WebElement clickOnUpload = driver.findElement(By.id("uploadFile"));
        Thread.sleep(2000);

//        clickOnUpload.sendKeys("C:\\Users\\akm.faisal\\Downloads\\UploadFile.png"); //Direct File path input

        //Upload from directory
        String filePath = "\\src\\test\\resources\\UploadFolder\\UploadFile.png";
        String uploadData = System.getProperty("user.dir") + filePath;
        clickOnUpload.sendKeys(uploadData);
        Thread.sleep(4000);
        //upload from directory close


    }

    @DisplayName("Download file")
    @Test
    @Order(2)
    public void download() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();
        Thread.sleep(500);

        WebElement dowloadButton = driver.findElement(By.id("downloadButton"));
        dowloadButton.click();
        Thread.sleep(2000);


    }

    @AfterAll
    public void closeBrowser() {
        driver.quit();

    }
}
