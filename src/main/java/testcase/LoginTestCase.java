package testcase;

import org.testng.annotations.Test;

import hooks.BaseClass; 
import pages.Login;
 
public class LoginTestCase extends BaseClass {
 
	@Test
	public void LoginTestCase() throws InterruptedException {
		 
		new Login(driver)
		.username("hari.radhakrishnan@qeagle.com")
		.password("Password@123")
		.loginButton()
		.clickAppLauncher()
		.clickSalesOption()
		.selectOpportunities()
		.clickNewButton()
		.createNewOpportunityWindow();
	}
}
