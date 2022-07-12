package GetOmnify;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.StaffLoginPage;
import pageObjects.chooseBusiness;
import pageObjects.DashboardServiceStoreGeneral;
import pageObjects.websiteHome;

public class DashboardServiceStoreGeneralTest extends base{
	
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
		
		DashboardServiceStoreGeneral dgs=new DashboardServiceStoreGeneral(driver);
		dgs.getDashboardSettings().click();
		dgs.getServiceStoreSettings().click();
		dgs.getGeneral().click();
		dgs.getServiceStoreURL().click();
		dgs.getServiceStoreURL().sendKeys(prop.getProperty("serviceStoreURL"));
		WebElement homePage = dgs.getHomePage();
		Boolean bool1 = homePage.isSelected();
		if(bool1==false) {
			homePage.click();
		}
		WebElement schedulePage = dgs.getSchedulePage();
		Boolean bool2 = homePage.isDisplayed();
		if(bool2==false) {
			schedulePage.click();
		}
		WebElement subscriptionPage = dgs.getSubscriptionPage();
		Boolean bool3 = subscriptionPage.isDisplayed();
		if(bool3==false) {
			subscriptionPage.click();
		}
		WebElement messageUsForm = dgs.getMessageUsForm();
		Boolean bool4 = homePage.isDisplayed();
		if(bool4==false) {
			messageUsForm.click();
		}
		Select defaultLandingPage=new Select(dgs.getDefaultLandingPage());
		String visibleTest = prop.getProperty("defaultLandingPage");
		defaultLandingPage.selectByVisibleText(visibleTest);
		dgs.getServiceStorePrimaryColor().sendKeys(prop.getProperty("serviceStorePrimaryColor"));
		dgs.getGeneralSettingsSave().click();Thread.sleep(3000);
		driver.close();
		}
}
