package ReviewClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class checkboxHandle {
    @Test
    public void checkboxSelect() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        List<WebElement> checkboxClick=driver.findElements(By.cssSelector(".rct-checkbox"));
        checkboxClick.get(0).click();
        Thread.sleep(4000);

        //Assertion Part start
        WebElement checkTest=driver.findElement(By.xpath("//div/span[text()='You have selected :']"));
        String ActualResult=checkTest.getText();
        String ExpectedResult="You have selected :";
        Assertions.assertEquals(ExpectedResult,ActualResult);
        Thread.sleep(4000);
        //Assertion Part close
        driver.quit();
    }
}
