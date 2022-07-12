package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class websiteHome {
	public WebDriver driver; 
	By signin = By.xpath("(//a[@class='buttonnew nofill nav w-nav-link'])[2]");

	public websiteHome(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getStaffLogin() {
		return driver.findElement(signin);
	}
}
