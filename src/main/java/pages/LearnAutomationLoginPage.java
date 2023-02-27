package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnAutomationLoginPage {

	WebDriver driver;
	public LearnAutomationLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By userName=By.xpath("//input[@placeholder='Enter Email']");
	
	By password =By.name("password1");
	
	By loginButton = By.cssSelector(".submit-btn");
	
	public void loginApplication(String username, String passWord) {
		
		driver.findElement(userName).sendKeys(username);
		driver.findElement(password).sendKeys(passWord);
		driver.findElement(loginButton).click();
		
	}
	
	By headerTextElement = By.xpath("//h1");
	
	By navigationBar = By.className("navbar-toggler-icon");
	
	By signoutButton = By.xpath("//button[text()='Sign out']");
	
	public void verificationCourseTitle() {
		boolean courseDisplayed = driver.findElement(headerTextElement).isDisplayed();
		System.out.println(courseDisplayed);
	}
	
	public void logoutAplication() {
		driver.findElement(navigationBar).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(signoutButton).click();
	}
}
