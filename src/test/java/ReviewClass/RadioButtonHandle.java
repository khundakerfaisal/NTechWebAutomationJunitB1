package ReviewClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RadioButtonHandle {
    @Test
    public void radioButtonSelect() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(500);
        List<WebElement> radioButtonSelection=driver.findElements(By.cssSelector(".custom-radio"));
        radioButtonSelection.get(1).click();
        Thread.sleep(4000);


    }
}
