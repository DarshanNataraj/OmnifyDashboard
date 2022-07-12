package GetOmnify;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.StaffLoginPage;
import pageObjects.chooseBusiness;
import pageObjects.DashboardGeneralBusinessSetting;
import pageObjects.websiteHome;

public class DashboardGeneralBusinessSettingsTest extends base{
	
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
		
		DashboardGeneralBusinessSetting dgs=new DashboardGeneralBusinessSetting(driver);
		dgs.getDashboardSettings().click();
		dgs.getGeneralSettings().click();
		dgs.getBusinessDetails().click();
		dgs.getBusinessName().click();
		dgs.getBusinessName().clear();
		dgs.getBusinessName().sendKeys(prop.getProperty("businessName"));
		dgs.getBusinessEmail().click();
		dgs.getBusinessEmail().clear();
		dgs.getBusinessEmail().sendKeys(prop.getProperty("businessEmail"));
		dgs.getCountry();
		Select countryDropDown=new Select(driver.findElement(By.xpath("//select[@id='field-10']")));
		String visibleTest = prop.getProperty("selectCountry");
		countryDropDown.selectByVisibleText(visibleTest);
		dgs.getPhoneNumber().clear();
		dgs.getPhoneNumber().sendKeys(prop.getProperty("phonenumber"));
//		dgs.getTimeZone().click();
		String toggle = dgs.getServiceStoreTimeZoneToggle().getAttribute("aria-checked");
		System.out.println(toggle);
		if(toggle!=prop.getProperty("showTimeZoneInServiceStore")) {
			driver.findElement(By.xpath("//mat-slide-toggle/descendant::div[1]")).click();
		}else {
		System.out.println(toggle);}
//		boolean b1 = dgs.getServiceStoreTimeZoneToggle().isSelected();
//		String s1 = String.valueOf(b1);
//		System.out.println(b1);
//		if (prop.getProperty("showTimeZoneInServiceStore") != s1) {
//			dgs.getServiceStoreTimeZoneToggle().click();
//		}
//		JavascriptExecutor tZL=(JavascriptExecutor)driver;
//		tZL.executeScript("arguments[0].click()",dgs.getTimeZone());
//		tZL.executeScript("arguments[0].sendKeys(prop.getProperty(\"timeZone\"))",dgs.getTimeZone());
		
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
////				{//*[@class='ng-dropdown-panel ng-select-top']}
//		}
//		
		
//		div[@class='ng-option ng-option-child']
		//TODO Toggle has to be handled with conditions.
//		dgs.getServiceStoreTimeZoneToggle().click();
		dgs.getGeneralSettingsSave().click();
		Thread.sleep(3000);
		driver.close();
		}
}
