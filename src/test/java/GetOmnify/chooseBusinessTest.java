package GetOmnify;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;
import pageObjects.StaffLoginPage;
import pageObjects.chooseBusiness;
import pageObjects.websiteHome;

public class chooseBusinessTest extends base{
	
	@Test
	public void StaffLoginPage() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		websiteHome selectBusiness = new websiteHome(driver);
		selectBusiness.getStaffLogin().click();
		StaffLoginPage slp= new StaffLoginPage(driver);
		slp.getEmail().sendKeys("darshan@getomnify.in");
//		slp.getEmail().sendKeys(prop.getProperty("staffEmail"));
		slp.getPassword().sendKeys(prop.getProperty("password"));
		slp.getLoginButton().click();
		chooseBusiness cb =new chooseBusiness(driver);
		cb.getSelectBusiness().click();
		cb.getContinueButton().click();
		Thread.sleep(3000);
		driver.close();
	}
}
