package ReviewClass2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HandalModal {
    @Test
    public void handelModal() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();

        WebElement modalSelect=driver.findElement(By.id("showSmallModal"));
        modalSelect.click();
        List<WebElement> modalClose=driver.findElements(By.cssSelector(".btn-primary"));
        modalClose.get(2).click();
        Thread.sleep(4000);


    }
}
