import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrowserTabHandle {
    @Test
    public void handleBrowserTab() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement tabButton=driver.findElement(By.id("tabButton"));
        tabButton.click();
        Thread.sleep(4000);

        //Handle tab start
        ArrayList<String> listOfTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listOfTab.get(1));
        Thread.sleep(2000);
        //Handle tab End

        //Assertion part start
        WebElement matchText= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        String ActualText=matchText.getText();
        String ExpectedText="This is a sample page";
        Thread.sleep(1000);
        Assertions.assertEquals(ExpectedText,ActualText);
        Thread.sleep(2000);
        //Assertion part close

        driver.close(); //Close tab

    }
}
