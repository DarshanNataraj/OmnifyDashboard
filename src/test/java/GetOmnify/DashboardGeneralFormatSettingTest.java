package GetOmnify;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.StaffLoginPage;
import pageObjects.chooseBusiness;
import pageObjects.DashboardGeneralFormatSetting;
import pageObjects.websiteHome;

public class DashboardGeneralFormatSettingTest extends base{
	
	@Test
	public void StaffLoginPage() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		websiteHome selectBusiness = new websiteHome(driver);
		selectBusiness.getStaffLogin().click();
		StaffLoginPage slp= new StaffLoginPage(driver);
		slp.getEmail().sendKeys(prop.getProperty("staffEmail"));
		slp.getPassword().sendKeys(prop.getProperty("password"));
		slp.getLoginButton().click();
		chooseBusiness cb =new chooseBusiness(driver);
		cb.getSelectBusiness().click();
		cb.getContinueButton().click();
		
		DashboardGeneralFormatSetting dgs=new DashboardGeneralFormatSetting(driver);
		dgs.getDashboardSettings().click();
		dgs.getGeneralSettings().click();
		Actions act = new Actions(driver);
		act.moveToElement(dgs.getFormat()).perform();
		dgs.getFormat().click();
		
		dgs.getSelectDateFormat();
		Select dateFormat = new Select(driver.findElement(By.xpath("(//select[@id='field-10'])[1]")));
		String visibleDateFormat=prop.getProperty("dateFormat");
		dateFormat.selectByVisibleText(visibleDateFormat);
		
		dgs.getSelectTimeFormat();
		Select timeFormat = new Select(driver.findElement(By.xpath("(//select[@id='field-10'])[2]")));
		String visibleTimeFormat=prop.getProperty("timeFormat");
		timeFormat.selectByVisibleText(visibleTimeFormat);
		
//		dgs.getFormatSave();
		dgs.getFormatCancel();
		Thread.sleep(3000);
		driver.close();
		
//		dgs.getBusinessName().sendKeys(prop.getProperty("businessName"));
//		dgs.getBusinessEmail().click();
//		dgs.getBusinessEmail().clear();
//		dgs.getBusinessEmail().sendKeys(prop.getProperty("businessEmail"));
//		dgs.getCountry();
//		Select countryDropDown=new Select(driver.findElement(By.xpath("//select[@id='field-10']")));
//		String visibleTest = prop.getProperty("selectCountry");
//		countryDropDown.selectByVisibleText(visibleTest);
//		dgs.getPhoneNumber().clear();
//		dgs.getPhoneNumber().sendKeys(prop.getProperty("phonenumber"));
//		dgs.getTimeZone().click();
//		dgs.getTimeZone().sendKeys(prop.getProperty("timeZone"));
//		String optionToSelect = prop.getProperty("timeZone");
//		List<WebElement> timeZoneList = driver.findElements(By.xpath("//div[@class='ng-option ng-option-child']//span"));
//		System.out.println(timeZoneList.size());
//		for(WebElement ele:timeZoneList) {
//			String currentOption=ele.getText();
//			if(currentOption.contains(optionToSelect)) {
//				ele.click();
//				break;
//			}
//				{//*[@class='ng-dropdown-panel ng-select-top']}
//		}
//		
		
//		div[@class='ng-option ng-option-child']
		//TODO Toggle has to be handled with conditions.
//		dgs.getServiceStoreTimeZoneToggle().click();
//		dgs.getGeneralSettingsSave().click();
		}
}
