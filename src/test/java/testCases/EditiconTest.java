package testCases;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.EditIconPage;

public class EditiconTest extends DriverInitialization {

	static EditIconPage ei = new EditIconPage();
	
	// check the icon Visiblity
   @Test
	public void editIcon() {
		
		PageFactory.initElements(driver, ei);
		EditIconPage.Editicon.isDisplayed();
		
		boolean EditIconVisible =	EditIconPage.Editicon.isDisplayed();
		  System.out.println("Button is Enable"+EditIconVisible);
		  boolean ExpectedbuttonVisible = true;
		  TestCasePrint("Verify Visibility Edit Icon",EditIconVisible,ExpectedbuttonVisible);
			
	}
	
	
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean iconVisible = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	iconVisible = false;
        }
        if (iconVisible) {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
          testcase.log(Status.INFO, "Correct value");
          testcase.log(Status.PASS, "");
        } else {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
          testcase.log(Status.INFO, "wrong value");
          testcase.log(Status.FAIL, "");
        }
		
        
	
        
	}
	
	// check the icon Enablity
	@Test
	public void iconEnablity() {
		
		PageFactory.initElements(driver, ei);

		boolean EditIconEnable = EditIconPage.Editicon.isEnabled();
		  System.out.println("Button is Enable"+EditIconEnable);
		  boolean ExpectedbuttonEnable = true;
		  TestCasePrint1("Verify Enablity Edit Icon",EditIconEnable,ExpectedbuttonEnable);
		  	
	}
	public static void TestCasePrint1(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean iconEnable = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	iconEnable = false;
        }
        if (iconEnable) {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
          testcase.log(Status.INFO, "Correct value");
          testcase.log(Status.PASS, "");
        } else {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
          testcase.log(Status.INFO, "wrong value");
          testcase.log(Status.FAIL, "");
        }
		
        
             
	}
	
	// check the icon back-ground color
	
	@Test
	public void iconBckgroundcolor() {
		
		PageFactory.initElements(driver, ei);

		String Actualbackgroundcolor = EditIconPage.Editicon.getCssValue("background-color"); 
	    System.out.println("Font Size: "+Actualbackgroundcolor); 
	    String Expectedcolor = "rgba(0, 0, 0, 0)";
	    TestCasePrint2("check edit icon background color",Expectedcolor,Actualbackgroundcolor);
		
	}
	public static void TestCasePrint2(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean iconbackgroundcolor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	iconbackgroundcolor = false;
        }
        if (iconbackgroundcolor) {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
          testcase.log(Status.INFO, "Correct value");
          testcase.log(Status.PASS, "");
        } else {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
          testcase.log(Status.INFO, "wrong value");
          testcase.log(Status.FAIL, "");
        }
}
	
	// Get Location of  Edit icon
	@Test
	public void iconPosition() {
		
		 
		Point ActualLocation = EditIconPage.Editicon.getLocation();
		int  actual_x    = ActualLocation.getX();
		int  actual_y    = ActualLocation.getY();
		
		System.out.println("X axis is:"+actual_x);
		System.out.println("Y axis is:"+actual_y);
		
		Point actualLocation = new Point(actual_x,actual_y);
		Point ExpectedLocation = new Point(373,23);
		TestCasePrint3("Verify Point Edit Icon",ExpectedLocation,actualLocation);
		
	}
	public static void TestCasePrint3(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean iconposition = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	iconposition = false;
        }
        if (iconposition) {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
          testcase.log(Status.INFO, "Correct value");
          testcase.log(Status.PASS, "");
        } else {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
          testcase.log(Status.INFO, "wrong value");
          testcase.log(Status.FAIL, "");
        }
}
	
	// Check the icon font size
	@Test
	public void iconFontsize() {
		
		PageFactory.initElements(driver, ei);

		String Actualfontsize = EditIconPage.Editicon.getCssValue("font-size"); 
	    System.out.println("Font Size: "+Actualfontsize); 
	    String Expectedfontsize = "14px";
	    TestCasePrint4("check edit icon font size",Expectedfontsize,Actualfontsize);
		
	}
	
	public static void TestCasePrint4(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean iconfontsize = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	iconfontsize = false;
        }
        if (iconfontsize) {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
          testcase.log(Status.INFO, "Correct value");
          testcase.log(Status.PASS, "");
        } else {
          testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
          testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
          testcase.log(Status.INFO, "wrong value");
          testcase.log(Status.FAIL, "");
        }
}
}

