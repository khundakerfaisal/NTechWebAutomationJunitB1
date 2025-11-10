package ReviewClass2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SelectDropdown {
    @Test
    public void dropdownSelection() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement selectValue=driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(selectValue);
        select.selectByValue("2");
        select.selectByVisibleText("Purple");
        Thread.sleep(4000);

//        selectValue.sendKeys(Keys.ARROW_DOWN);
//        selectValue.sendKeys(Keys.ARROW_DOWN);
//        selectValue.sendKeys(Keys.ENTER);
//        selectValue.sendKeys(Keys.ENTER);
            driver.quit();
    }
}
