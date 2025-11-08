import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ButtonHandle {
    @Test
    public void buttonHandle() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(500);


        //Double click
        Actions action=new Actions(driver);
        List<WebElement> doubleClickButton=driver.findElements(By.cssSelector("button"));
        action.doubleClick(doubleClickButton.get(1)).perform();
        Thread.sleep(500);

        // Right click
        List<WebElement> RightClickButton=driver.findElements(By.cssSelector("button"));
        action.contextClick(RightClickButton.get(2)).perform();
        Thread.sleep(500);

        // click me
        List<WebElement> ClickButton=driver.findElements(By.cssSelector("button"));
        action.click(ClickButton.get(3)).perform();
        Thread.sleep(500);





    }
}
