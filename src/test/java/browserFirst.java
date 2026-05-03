import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFirst {

    @Test
    public void Browse(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }
}
