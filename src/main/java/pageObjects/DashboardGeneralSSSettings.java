package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardGeneralSSSettings {
	public WebDriver driver; 
	public Properties prop;
	
	By dashboardSettings = By.xpath("//span[contains(text(),'Settings')]//following::a[@class='main-navigation-link w-inline-block margin-bottom-30']");
	By generalSettings = By.xpath("//a[@class='sub-settings-option w-inline-block']//div[contains(text(),'General')]");
	By address = By.xpath("(//div[@class='sub-settings-label'])[2]");
	By locateMeButton = By.xpath("//button[contains(text(),'Locate Me')]");
	By changeLocation = By.xpath("//button[@class='primary-button w-button margin-top-20 anchor-style']");
	By location = By.xpath("//input[@class='form__input-field no-margin set-width w-input ng-pristine pac-target-input ng-valid ng-touched']");
	By addressLine1 = By.xpath("//input[@formcontrolname='addressLine1']");
	By addressLine2 = By.xpath("//input[@formcontrolname='addressLine2']");
	By city = By.xpath("//input[@formcontrolname='city']");
	By state = By.xpath("//input[@formcontrolname='state']");
	By zipcode = By.xpath("//input[@formcontrolname='zip_code']");
	By countryForAddress = By.xpath("//input[@formcontrolname='country']");
	By addressCancel = By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[contains(text(),'Cancel')]");
	By addressSave = By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[contains(text(),'Save')]");
	
//	By formats = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
//	By locations = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
//	By globalWordings = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
	public WebElement getDashboardSettings() {
		return driver.findElement(dashboardSettings);
	}
	
	public WebElement getGeneralSettings() {
		return driver.findElement(generalSettings);
	}
	public DashboardGeneralSSSettings(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAddress() {
		return driver.findElement(address);
	}
	public WebElement getLocateMeButton() {
		return driver.findElement(locateMeButton);
	}
	public WebElement getChangeLocation() {
		return driver.findElement(changeLocation);
	}
	public WebElement getLocation() {
		return driver.findElement(location);
	}
	public WebElement getAddressLine1() {
		return driver.findElement(addressLine1);
	}
	public WebElement getAddressLine2() {
		return driver.findElement(addressLine2);
	}
	public WebElement getCity() {
		return driver.findElement(city);
	}
	public WebElement getState() {
		return driver.findElement(state);
	}
	public WebElement getZipcode() {
		return driver.findElement(zipcode);
	}
	public WebElement getCountryfromAddress() {
		return driver.findElement(countryForAddress);
	}
	public WebElement getAddressCancel() {
		return driver.findElement(addressCancel);
	}
	public WebElement getAddressSave() {
		return driver.findElement(addressSave);
	}
}
