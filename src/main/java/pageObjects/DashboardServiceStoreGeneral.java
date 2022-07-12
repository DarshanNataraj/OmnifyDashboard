package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardServiceStoreGeneral {
	public WebDriver driver; 
	public Properties prop;
	
	By dashboardSettings = By.xpath("//span[contains(text(),'Settings')]//following::a[@class='main-navigation-link w-inline-block margin-bottom-30']");
	By serviceStoreSettings = By.xpath("//div[@class='settings-wrapper__setting']//div[contains(text(),'Service Store')]");
	By general = By.xpath("//a[@class='sub-settings-option w-inline-block is-selected']//div[contains(text(),'General')]");
	By serviceStoreURL = By.xpath("//div[@class='form__input-field-wrapper is-flex set-width']//input");
	By homePage = By.xpath("//span[contains(text(),'Home Page')]");
	By schedulePage = By.xpath("//span[contains(text(),'Schedules Page')]");
	By subscriptionPage =By.xpath("//span[contains(text(),'Subscriptions Page')]");
	By messageUsForm = By.xpath("//span[contains(text(),'Message us form')]");
	By defaultLandingPage = By.id("landing_page");
	By serviceStorePrimaryColor=By.xpath("(//div[@class='form__item bottom-margin-0']//following::input)[1]");
	By generalSettingsSave=By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//button[contains(text(),'Save')]");
	By generalSettingsCancel = By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//button[contains(text(),'Cancel')]");
	public DashboardServiceStoreGeneral(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getDashboardSettings() {
		return driver.findElement(dashboardSettings);
	}
	
	public WebElement getServiceStoreSettings() {
		return driver.findElement(serviceStoreSettings);
	}
	public WebElement getGeneral() {
		return driver.findElement(general);
	}
	
	public WebElement getServiceStoreURL() {
		return driver.findElement(serviceStoreURL);
	}
	
	public WebElement getHomePage() {
		return driver.findElement(homePage);
	}
	public WebElement getSchedulePage() {
		return driver.findElement(schedulePage);
	}
	public WebElement getSubscriptionPage() {
		return driver.findElement(subscriptionPage);
	}
	public WebElement getMessageUsForm() {
		return driver.findElement(messageUsForm);
	}
	public WebElement getDefaultLandingPage() {
		return driver.findElement(defaultLandingPage);
	}
	public WebElement getServiceStorePrimaryColor() {
		return driver.findElement(serviceStorePrimaryColor);
	}
	public WebElement getGeneralSettingsSave() {
		return driver.findElement(generalSettingsSave);
	}
	public WebElement getGeneralSettingsCancel() {
		return driver.findElement(generalSettingsCancel);
	}
}
