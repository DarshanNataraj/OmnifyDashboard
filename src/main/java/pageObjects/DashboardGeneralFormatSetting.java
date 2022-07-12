package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardGeneralFormatSetting {
	public WebDriver driver; 
	public Properties prop;
	
	By dashboardSettings = By.xpath("//div[@id='wrapper']//following::div[contains(text(),'Settings')]");
	By generalSettings = By.xpath("//div[@class='settings-wrapper__icon is--flex margin--right']//following::div[contains(text(),'General')]");
	By format = By.xpath("(//div[@class='sub-settings-label'])[3]");
	By selectDateFormat = By.xpath("(//div[@class='form__select-wrapper'])[1]");
	By selectTimeFormat = By.xpath("(//div[@class='form__select-wrapper'])[2]");
	By formatCancel = By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[contains(text(),'Cancel')]");
	By formatSave = By.xpath("//div[@class='content-card__cta-wrapper is-flex top-border']//a[contains(text(),'Save')]");
	
//	By formats = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
//	By locations = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
//	By globalWordings = By.xpath("//div[@class='sub-settings-label'][contains(text(),'Business Details')]");
	public WebElement getDashboardSettings() {
		return driver.findElement(dashboardSettings);
	}
	
	public WebElement getGeneralSettings() {
		return driver.findElement(generalSettings);
	}
	public DashboardGeneralFormatSetting(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getFormat() {
		return driver.findElement(format);
	}
	public WebElement getSelectDateFormat() {
		return driver.findElement(selectDateFormat);
	}
	public WebElement getSelectTimeFormat() {
		return driver.findElement(selectTimeFormat);
	}
	public WebElement getFormatCancel() {
		return driver.findElement(formatCancel);
	}
	public WebElement getFormatSave() {
		return driver.findElement(formatSave);
	}
}
