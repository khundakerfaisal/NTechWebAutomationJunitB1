import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement loginButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        loginButton.click();



//        Thread.sleep(4000);
//        driver.quit();

    }
}
