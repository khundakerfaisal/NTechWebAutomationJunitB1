package ReviewClass2;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScrollDownAndScrollUp {
    public WebDriver driver;

    @BeforeAll
    public void startBrowser() {
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
    @Order(2)
    public void scrollUp() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver; //Executor script
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,800)"); //Scroll down
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,0)"); //scroll up
        Thread.sleep(1000);
    }

    @AfterAll
    public void closeBrowser() {
        driver.quit();
    }
}
