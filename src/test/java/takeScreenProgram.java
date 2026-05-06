import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenProgram {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        String filePath = "C:/Users/akm.faisal/Downloads/" + System.currentTimeMillis() + ".png";
        File destFile=new File(filePath);
        FileUtils.copyFile(srcFile,destFile);
        Thread.sleep(2000);
    }
}
