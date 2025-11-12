import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrowserWindowHandle {
    @Test
    public void handleBrowserWindow() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement windowButton=driver.findElement(By.id("windowButton"));
        windowButton.click();

        String mainWindow=driver.getWindowHandle(); //Main window
        Set<String> allWindow=driver.getWindowHandles(); //All window handle

        for (String getAllWindow:allWindow){ //Get all window
            if (!getAllWindow.equals(mainWindow)) {
                driver.switchTo().window(getAllWindow); //go to the different window

                //Assertion part start
                String ActualText=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(ActualText.contains("This is a sample page"));
                //assertion part close
            }
        }
        driver.close();
        driver.switchTo().window(mainWindow);


    }
}
