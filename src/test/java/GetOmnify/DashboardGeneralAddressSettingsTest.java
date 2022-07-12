package GetOmnify;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.StaffLoginPage;
import pageObjects.chooseBusiness;
import pageObjects.DashboardGeneralAddressSetting;
import pageObjects.websiteHome;

public class DashboardGeneralAddressSettingsTest extends base{
	
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
		
		DashboardGeneralAddressSetting dgs=new DashboardGeneralAddressSetting(driver);
		dgs.getDashboardSettings().click();
		dgs.getGeneralSettings().click();
		Actions act = new Actions(driver);
		act.moveToElement(dgs.getAddress()).perform();
		dgs.getAddress().click();
		dgs.getLocateMeButton();
		dgs.getLocateMeButton().click();
		Thread.sleep(10000);
//		act.moveToElement(dgs.getChangeLocation()).perform();
//		dgs.getChangeLocation().click();
//		dgs.getLocation().clear();
//		dgs.getLocation().sendKeys(prop.getProperty("location"));
		act.moveToElement(dgs.getAddressLine1()).perform();
		dgs.getAddressLine1().clear();
		dgs.getAddressLine1().sendKeys(prop.getProperty("addressLine1"));
		dgs.getAddressLine2().clear();
		dgs.getAddressLine2().sendKeys(prop.getProperty("addressLine2"));
		dgs.getCity().clear();
		dgs.getCity().sendKeys(prop.getProperty("city"));
		dgs.getState().clear();
		dgs.getState().sendKeys(prop.getProperty("state"));
		dgs.getZipcode().clear();
		dgs.getZipcode().sendKeys(prop.getProperty("zipCode"));
		dgs.getCountryfromAddress().clear();
		dgs.getCountryfromAddress().sendKeys(prop.getProperty("selectCountry"));
		dgs.getAddressSave().click();
		Thread.sleep(3000);
		driver.close();
	}
}
