package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.DriverInitialization;
import commonPages.Master;

public class MasterClick extends DriverInitialization{
	
	static Master mr = new Master();
	
	
	@Test
	public void master() throws InterruptedException {
		
		
		PageFactory.initElements(driver, mr);
		Thread.sleep(2000);
		commonPages.Master.Master.click();
		commonPages.Master.Materialclick.click();
		
		
		
		
		
	}
	
		
		
		
		
	

}
