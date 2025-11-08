import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.function.BooleanSupplier;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //Test Instance
public class Checkbox {
    @Test
    public void checkBox() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> checkBoxSelect=driver.findElements(By.cssSelector(".rct-checkbox"));
        checkBoxSelect.get(0).click();
        Thread.sleep(4000);
        WebElement ExpectedResult=driver.findElement(By.xpath("//div/span[text()='You have selected :']"));
        String actualText = ExpectedResult.getText();
        String expectedText = "You have selected :11";
        Assertions.assertEquals(expectedText, actualText);
        driver.quit();


    }
}
