import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FrameHandle {
    @Test
    public void handleFrame() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.switchTo().frame("frame1"); //switch to frame Handle

        //Assertion start
        String textExpected=driver.findElement(By.id("sampleHeading")).getText();
        String textActual="This is a sample page";
        Assertions.assertTrue(textExpected.contains(textActual));
        //Assertion Close

        driver.switchTo().defaultContent(); //Switch to main content
        Thread.sleep(4000);

    }
}
