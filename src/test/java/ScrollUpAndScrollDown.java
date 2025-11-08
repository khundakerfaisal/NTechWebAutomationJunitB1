import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Order wise Run
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Test Instance
public class ScrollUpAndScrollDown {
    public WebDriver driver;

    @BeforeAll
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    public void scrollDown() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
    }

    @Test
    @Order(1)
    public void scrollUp() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver; //Executor script
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,800)"); //Scroll down
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,0)"); //scroll up
        Thread.sleep(1000);
        WebElement currentAddress=driver.findElement(By.id("currentAddress")); //Scroll with indevisual element
        js.executeScript("arguments[0].scrollIntoView(true)",currentAddress);
        Thread.sleep(4000);
    }

    @AfterAll
    void tearDown() {
//        driver.quit();
    }


}
