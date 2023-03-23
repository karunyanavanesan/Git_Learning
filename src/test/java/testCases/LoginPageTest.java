package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.DriverInitialization;
import commonPages.LoginPage;

public class LoginPageTest extends DriverInitialization {

	static LoginPage lp = new LoginPage();
	
	@Test
	public static void loginButton()  {
		
		PageFactory.initElements(driver, lp);
		
		commonPages.LoginPage.Username.sendKeys("admin");
		commonPages.LoginPage.Password.sendKeys("tokyo@admin");
		commonPages.LoginPage.LoginButton.click();
		
		
		
		
		
		
		
	}
	
}
	
	
