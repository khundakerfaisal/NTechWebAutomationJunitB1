
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NewProgram2 {
    WebDriver driver;

    @BeforeAll
    public void StartBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Order(1)
    @Test
    public void ScrollUpAndScrollDown() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(1000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", currentAddress);

        Thread.sleep(2000);

        System.out.println("Scroll up and down test completed!");


    }

    @Order(2)
    @Test
    public void checkBox() throws InterruptedException {

        driver.get("https://demoqa.com/checkbox");

        Thread.sleep(1000);


        WebElement homeCheckbox = driver.findElement(By.cssSelector(".rct-checkbox"));
        homeCheckbox.click();

        Thread.sleep(2000);

        System.out.println("Checkbox test completed!");

    }

    @AfterAll
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }
}