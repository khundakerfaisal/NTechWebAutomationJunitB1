import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    @Test
    public void radioButton() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> radioButtonSelect=driver.findElements(By.cssSelector(".custom-radio"));
        radioButtonSelect.get(1).click();
        Thread.sleep(4000);

        driver.quit();


    }
}
