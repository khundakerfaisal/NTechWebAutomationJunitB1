
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDate;
import java.util.List;

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


        List<WebElement> homeCheckbox = driver.findElements(By.cssSelector(".rc-tree-checkbox"));
        homeCheckbox.get(0).click();

        Thread.sleep(2000);

        System.out.println("Checkbox test completed!");

    }
    @Order(3)
    @Test
    public void selectDate() throws InterruptedException {

        driver.get("https://demoqa.com/date-picker");

        Thread.sleep(2000);

        WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
        selectDate.sendKeys(Keys.CONTROL+"a");
        selectDate.sendKeys(Keys.BACK_SPACE);

        Thread.sleep(2000);
        LocalDate date=LocalDate.now();
        selectDate.sendKeys(date.toString());
        Thread.sleep(2000);

        System.out.println("Checkbox test completed!");

    }
    @Order(4)
    @Test
    public void buttonClick() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions actions=new Actions(driver);


        List<WebElement> doubleClick = driver.findElements(By.cssSelector(".btn-primary"));

        actions.doubleClick(doubleClick.get(1)).perform();
        List<WebElement> RightClickButton=driver.findElements(By.cssSelector("button"));
        actions.contextClick(RightClickButton.get(2)).perform();
        Thread.sleep(500);
        List<WebElement> clickButton=driver.findElements(By.cssSelector("button"));
        actions.click(clickButton.get(3)).perform();

        Thread.sleep(2000);


    }

    @AfterAll
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully!");
        }
    }
}