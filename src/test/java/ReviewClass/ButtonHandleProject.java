package ReviewClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ButtonHandleProject {
    @Test
    public void buttonHandle() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(500);

        //Double click
        Actions actions=new Actions(driver);
        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButton).perform();

        //Right click
        WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();

        // click me
        WebElement ClickButton=driver.findElement(By.id("vSkXX"));
        actions.click(ClickButton).perform();



    }
}
