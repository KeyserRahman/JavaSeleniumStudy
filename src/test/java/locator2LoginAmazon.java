import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class locator2LoginAmazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rehem\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.amazon.com");
        driver.wait(1000);
        //driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        //driver.findElement(By.className("nav-action-inner")).click();
        //driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']")).click();
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.wait(1000);
        //Scanner scan = new Scanner(System.in);

    }
}
