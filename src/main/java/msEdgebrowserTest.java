import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class msEdgebrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\rehem\\Documents\\selenium dependencies\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://translate.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        //close all associated windows
        //driver.quit();

	}

}
