import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class AlertHandleProgram {
    WebDriver driver;

    @BeforeEach
    public void StartBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Order(1)
    @Test
    public void alertButton() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Order(2)
    @Test
    public void timeAlertButton() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Order(3)
    @Test
    public void confirmButton() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);


        String actualText = driver.findElement(By.id("confirmResult")).getText();
        Assertions.assertTrue(actualText.contains("You selected Ok"));

    }

    @Order(4)
    @Test
    public void promptButton() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(6000);
        driver.switchTo().alert().sendKeys("Faisal");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);


        String expectedText = driver.findElement(By.id("promptResult")).getText();
        String actualText = "You entered Faisal";
        Assertions.assertEquals(expectedText, actualText);

    }

    @AfterEach
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }

}
