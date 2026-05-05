import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class tabHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);

        ArrayList<String> tabData=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabData.get(1));
        Thread.sleep(2000);
        driver.close();
    }
}
