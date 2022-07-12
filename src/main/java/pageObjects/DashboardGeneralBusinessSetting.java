package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardGeneralBusinessSetting {
	public WebDriver driver; 
	public Properties prop;
	
	By dashboardSettings = By.xpath("//span[contains(text(),'Settings')]//following::a[@class='main-navigation-link w-inline-block margin-bottom-30']");
	By generalSettings = By.xpath("//div[@class='settings-wrapper__icon is--flex margin--right']//following::div[contains(text(),'General')]");
	By businessDetails = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
	By businessName = By.xpath("//input[@placeholder=\"e.g. Sarah's Saloon\"]");
	By businessEmail = By.xpath("//input[@placeholder='e.g. admin@business.com']");
	By countryAndCurrency = By.xpath("//select[@id='field-10']"); //Dropdown for country
	String country1;
	By phoneNumber =By.xpath("//input[@name='phoneNumber']");
	By timeZoneDropDown = By.xpath("//form[@name='wf-form-Website-Settings-Form']/div[5]/div[3]/ng-select");
	By showTimeZone=By.xpath("//mat-slide-toggle/descendant::input");
	By generalSettingsCancel=By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[@class='secondary-button w-button']");
	By generalSettingsSave=By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[@class='primary-button margin-right w-button']");
	
//	By timeZoneDropDown =By.xpath("//div[@class='ng-option ng-option-child ng-option-marked']//following::span[contains(text(),'"+prop.getProperty("timeZone")+"')]");
	By address = By.xpath("//a[@class='sub-settings-option w-inline-block is-selected']//div");
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
	public DashboardGeneralBusinessSetting(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getDashboardSettings() {
		return driver.findElement(dashboardSettings);
	}
	
	public WebElement getGeneralSettings() {
		return driver.findElement(generalSettings);
	}
	public WebElement getBusinessDetails() {
		return driver.findElement(businessDetails);
	}
	
	public WebElement getBusinessName() {
		return driver.findElement(businessName);
	}
	
	public WebElement getBusinessEmail() {
		return driver.findElement(businessEmail);
	}
	public WebElement getCountry() {
		return driver.findElement(countryAndCurrency);
	}
	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}
	//TODO Time Zone Dropdown has to be handled.
	public WebElement getTimeZone() {
		return driver.findElement(timeZoneDropDown);
	}
	public WebElement getServiceStoreTimeZoneToggle() {
		return driver.findElement(showTimeZone);
	}
	public WebElement getGeneralSettingsSave() {
		return driver.findElement(generalSettingsSave);
	}
	public WebElement getGeneralSettingsCancel() {
		return driver.findElement(generalSettingsCancel);
	}
	public WebElement getAddress() {
		return driver.findElement(address);
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
