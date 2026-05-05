import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        String textExpected=driver.findElement(By.id("sampleHeading")).getText();
        String textActual="This is a sample page";
        Assertions.assertTrue(textExpected.contains(textActual));
        driver.switchTo().defaultContent();
        Thread.sleep(5000);


    }
}
