import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ModalHandle {
    @Test
    public void Modal() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();
        WebElement handleLargeModal=driver.findElement(By.id("showLargeModal"));
        handleLargeModal.click();
        Thread.sleep(500);

    }
}
