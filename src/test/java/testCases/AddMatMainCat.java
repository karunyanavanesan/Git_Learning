package testCases;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.AddMatMain;


public class AddMatMainCat extends DriverInitialization {

	static AddMatMain amt = new AddMatMain();
	
	
	

	@Test
 public void materialMain() {
		
	PageFactory.initElements(driver, amt);
	AddMatMain.AddMaterialButton.isDisplayed();
		
		
	
	
	// Get Location of AddMainMateial Button 
	 
	
	Point ActualLocation = AddMatMain.AddMaterialButton.getLocation();
	int  actual_x    = ActualLocation.getX();
	int  actual_y    = ActualLocation.getY();
	
	System.out.println("X axis is:"+actual_x);
	System.out.println("Y axis is:"+actual_y);
	
	Point actualLocation = new Point(actual_x,actual_y);
	Point ExpectedLocation = new Point(860,98);
	TestCasePrint("Verify Point Add Material Button",ExpectedLocation,actualLocation);
	
	
	
	
	}
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean position = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
          position = false;
        }
        if (position) {
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
	
	
	
	@Test
	public void fontSize() {
		
		PageFactory.initElements(driver, amt);
		
		
		// Get Font-Size AddMainMateial Button 
		 
		
		String ActualfontsSize = AddMatMain.AddMaterialButton.getCssValue("font-size"); 
	    System.out.println("Font Size: "+ActualfontsSize); 
	    String ExpectedSize = "14px";
	    TestCasePrint1("Verify Font-Size Add Material Button",ExpectedSize,ActualfontsSize);
		
		
	}
	
	
	public static void TestCasePrint1(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean size = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	size = false;
        }
        if (size) {
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
	
	
	// get add button background color
	@Test
	public void buttonColor() {
		
    PageFactory.initElements(driver, amt);
		
		
		// Get button color AddMainMateial Button 
		
		String Actualbackgroundcolor = AddMatMain.AddMaterialButton.getCssValue("background-color"); 
	    System.out.println("Background color: "+Actualbackgroundcolor); 
	    String ExpectedColor = "rgba(0, 0, 0, 0)";
	    TestCasePrint2("Verify background-color Add Material Button",ExpectedColor,Actualbackgroundcolor);
		
	}
	public static void TestCasePrint2(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean backgroundcolor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	backgroundcolor = false;
        }
        if (backgroundcolor) {
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
	
	// Check Add button enable
	@Test
	public void buttonEnable() {
		
	  boolean ActualaddbuttonEnable =	AddMatMain.AddMaterialButton.isEnabled();
	  System.out.println("Button is Enable"+ActualaddbuttonEnable);
	  boolean ExpectedbuttonEnable = true;
	  TestCasePrint3("Verify Enablity Add Material Button",ActualaddbuttonEnable,ExpectedbuttonEnable);
		
	}
	public static void TestCasePrint3(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean buttonEnable = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	buttonEnable = false;
        }
        if (buttonEnable) {
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
	
	// Check Visibility of Add button
	
	@Test
	public void visibilityButton() {
		PageFactory.initElements(driver, amt);
		boolean ActualaddbuttonVisible =	AddMatMain.AddMaterialButton.isDisplayed();
		  System.out.println("Button is Enable"+ActualaddbuttonVisible);
		  boolean ExpectedbuttonVisible = true;
		  TestCasePrint4("Verify Visibility Add Material Button",ActualaddbuttonVisible,ExpectedbuttonVisible);
		
		
	}
	
	public static void TestCasePrint4(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean buttonVisible = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	buttonVisible = false;
        }
        if (buttonVisible) {
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

