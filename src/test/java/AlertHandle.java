import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AlertHandle {
    @Test
    public void handleAlert() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Click on alert with accept button

        List<WebElement> alertButton =driver.findElements(By.cssSelector(".btn-primary"));
        alertButton.get(0).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Click on alert after 5 min
        List<WebElement> alertButtonAfter5min =driver.findElements(By.cssSelector(".btn-primary"));
        alertButtonAfter5min.get(1).click();
        Thread.sleep(6000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Click on alert and input name
        List<WebElement> alertButtonWithInput =driver.findElements(By.cssSelector(".btn-primary"));
        alertButtonWithInput.get(3).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Atiq vai");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.quit();


    }
}
