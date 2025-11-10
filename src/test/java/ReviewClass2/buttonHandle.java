package ReviewClass2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class buttonHandle {
    @Test
    public void buttonSelection() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(500);

        //Double click
        Actions actions=new Actions(driver);
        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(2000);

        //Right click
        WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();
        Thread.sleep(2000);

        //dynamic click
        List<WebElement> clickButton=driver.findElements(By.cssSelector(".btn-primary"));
        actions.click(clickButton.get(2)).perform();
        Thread.sleep(2000);


        driver.quit();

    }
}
