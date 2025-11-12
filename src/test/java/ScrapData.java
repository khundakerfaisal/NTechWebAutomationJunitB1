import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScrapData {
    @Test
    public void scrapTableData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> totalTableData=driver.findElements(By.className("rt-tbody"));
        List<WebElement> totalRowsData=driver.findElements(By.className("rt-tr-group"));


        System.out.println("<<< Start Table Data >>>");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-10s %-20s %-15s%n",
                "First Name", "Last Name", "Age", "Email", "Salary", "Department");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (WebElement rows:totalRowsData){
            List<WebElement> totalCellData=rows.findElements(By.className("rt-td"));
            for (WebElement cells:totalCellData){
//                System.out.println(cells.getText());
                System.out.printf("%-15s", cells.getText());
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("<<< End Table Data >>>");

        Thread.sleep(2000);

    }
}
