package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StaffLoginPage {
	public WebDriver driver; 
	By email = By.xpath("//input[@type='email']");
	By password = By.xpath("//input[@type='password']");
	By loginButton=By.xpath("//button[contains(text(),'Log In')]");
	By userName = By.xpath("//div[@class='m-b-md']");

	public StaffLoginPage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	public WebElement getUserName() {
		return driver.findElement(userName);
	}
}
