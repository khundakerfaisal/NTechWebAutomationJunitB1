package ReviewClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SelectDropDownProject {
    @Test
    public void selectDropdown() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement dropdownSelection=driver.findElement(By.id("oldSelectMenu"));
        Select valueSelection=new Select(dropdownSelection);
        valueSelection.selectByValue("2");
        valueSelection.selectByVisibleText("Purple");
        Thread.sleep(4000);

    }
}
