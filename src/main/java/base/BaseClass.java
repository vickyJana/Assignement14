package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import browserFactory.BrowserFactory;
import helper.ConfigReader;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	//@BeforeClass
	public void setupBrowser() {
		System.out.println("Log Info - Setting Up Browser");
		driver = BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("URL"));
		System.out.println("Log Info - Application is up and Running");
	}
	
	@AfterMethod
	//@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("Log Info - Closing the Browser");
	}
	
}
