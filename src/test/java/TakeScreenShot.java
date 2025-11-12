import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TakeScreenShot {
    @Test
    public void createScreenShot() throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        //Take screenshot interface class
        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE); //file type

        Random number=new Random(); //generate random number
        int generateNumber=number.nextInt(999)+111; //generate random number

        String filePath="./src/test/resources/screenshots/"+generateNumber+".jpg"; //file path
        File destFile=new File(filePath); //dest file


        FileUtils.copyFile(sourceFile,destFile); //get screenshot
        Thread.sleep(2000);

        driver.quit();

    }
}
