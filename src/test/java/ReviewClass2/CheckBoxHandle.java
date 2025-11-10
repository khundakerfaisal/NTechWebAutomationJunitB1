package ReviewClass2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckBoxHandle {
    @Test
    public void checkboxSelect() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        List<WebElement> checkBoxSelect=driver.findElements(By.cssSelector(".rct-checkbox"));
        checkBoxSelect.get(0).click();
        Thread.sleep(4000);

        //Test Assertion Part
        WebElement checkText=driver.findElement(By.xpath("//div/span[text()='You have selected :']"));
        String ActualResult=checkText.getText();
        String ExpectedResult="You have selected :11";
        Assertions.assertEquals(ExpectedResult,ActualResult);
        Thread.sleep(2000);

    }
}
