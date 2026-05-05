import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleProgram {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow=driver.getWindowHandle();

        Set<String> allWindow=driver.getWindowHandles();

        for (String getAllWindow : allWindow){
            if (!getAllWindow.equals(mainWindow)) {
                driver.switchTo().window(getAllWindow);
                String textActual=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;

            }
        }
        driver.close();
        driver.switchTo().window(mainWindow);



    }
}
