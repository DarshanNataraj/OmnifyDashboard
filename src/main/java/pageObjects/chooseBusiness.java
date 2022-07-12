package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class chooseBusiness {
	public WebDriver driver; 
	
	By selectBusiness = By.xpath("//*[contains(text(),'R R Kick Boxing')]");
	By continueButton = By.xpath("//button[@class='btn btn-primary btn-width']");
	public chooseBusiness(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getSelectBusiness() {
		return driver.findElement(selectBusiness);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
	}
}
