import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locator1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\rehem\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.amazon.com");
        driver.manage().window().fullscreen();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.id("nav-search-submit-button"));
        //found result by CSS, "div[class='value']"), print result
        System.out.println("search result is shown as: " + driver.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small']")).getText());
        // cannot using "div" as tagname
        //System.out.println(driver.findElement(By.cssSelector("div.a-section a-spacing-small a-spacing-top-small")).getText());
        driver.close();
    }
}
