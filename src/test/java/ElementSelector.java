import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/text-box"); //Find css Locator url
//        driver.get("https://demoqa.com/text-box"); //find id locator
//        driver.get("https://www.saucedemo.com/"); //find name locator
//        driver.get("https://demoqa.com/links"); //link  locator
//        driver.get("https://demoqa.com/webtables"); //css selector  locator
//        driver.get("https://demoqa.com/elements"); //Absolute/relative xpath  locator
        driver.get("https://demoqa.com/text-box"); //relative xpath  locator

        driver.manage().window().maximize();
        Thread.sleep(4000);
//        driver.findElement(By.id("userName")).sendKeys("Mashrur vai"); //Id Locator
//        driver.findElement(By.name("user-name")).sendKeys("Masud vai"); //name locator
//        driver.findElement(By.linkText("Home")).click(); //link locator
//        driver.findElement(By.partialLinkText("Ho")).click(); //partial link locator
//        driver.findElement(By.className("btn-primary")).click();//Class Selector
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[1]")).click(); //absolute xpath
        driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Atiq vai"); //relative xpath

        Thread.sleep(4000);
//        driver.findElements(By.cssSelector(".btn-light")).get(1).click(); //css selector locator
    }

}
