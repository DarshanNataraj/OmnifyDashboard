package GetOmnify;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.websiteHome;
import resources.base;
import pageObjects.StaffLoginPage;

public class StaffLoginTest extends base{
	
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
		Thread.sleep(3000);
		driver.close();

		//Assert.assertEquals(slp.getUserName().getText(), "Darshan Nataraj");
		
	}
}
