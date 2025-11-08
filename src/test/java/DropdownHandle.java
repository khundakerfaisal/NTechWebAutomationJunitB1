import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DropdownHandle {
    @Test
    public void dropdownHandle(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement selectColour=driver.findElement(By.id("oldSelectMenu"));
        //Select dropdown handle

        Select itemSelect=new Select(selectColour);
        itemSelect.selectByValue("2");
        itemSelect.selectByVisibleText("Yellow");

    }
}
