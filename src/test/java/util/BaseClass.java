package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchBrowser() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		//return driver;
		}
	
	public void tearDown() {
		if(driver!=null) {
		driver.close();
		driver=null;
		}
	}

}
