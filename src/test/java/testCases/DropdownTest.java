package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.DropdownPage;
import commonPages.TextPage;

public class DropdownTest extends DriverInitialization{
	
	static DropdownPage dp = new DropdownPage();
	
	
	@Test
	public void maintypeDropdown() {
		
		PageFactory.initElements(driver, dp);
		DropdownPage.MaintypaDropdown.isDisplayed();
		
		// check  main dropdown border color
		  String Actualdropbordercolor = DropdownPage.MaintypaDropdown.getCssValue("color");
		  System.out.println("Text is Visible"+Actualdropbordercolor);
		  String Expectedbordertcolor = "rgba(0, 0, 0, 0.85)";
		  TestCasePrint("Verify dpdown border color",Actualdropbordercolor,Expectedbordertcolor);
		
		  
		// check  main dropdown size
		  String Actualdropsize = DropdownPage.MaintypaDropdown.getCssValue("font-size");
		  System.out.println("Text is Visible"+Actualdropsize);
		  String Expectedbgsize = "14px";
		  TestCasePrint1("Verify dpdown size",Actualdropsize,Expectedbgsize);
		  
		// check  main dropdown box size
		  String Actualdropboxsize = DropdownPage.MaintypaDropdown.getCssValue("box-sizing");
		  System.out.println("Text is Visible"+Actualdropboxsize);
		  String Expectedbgboxsize = "border-box";
		  TestCasePrint2("Verify dpdown box size",Actualdropboxsize,Expectedbgboxsize);
		  
		// check  main dropdown box size
		  String Actualdpcursor = DropdownPage.MaintypaDropdown.getCssValue("cursor");
		  System.out.println("Text is Visible"+Actualdpcursor);
		  String Expectedbgcursor = "auto";
		  TestCasePrint3("Verify dpdown cursor point",Actualdpcursor,Expectedbgcursor);
	}
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean bordercolor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	bordercolor = false;
        }
        if (bordercolor) {
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
	
	public static void TestCasePrint1(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean bgsize = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	bgsize = false;
        }
        if (bgsize) {
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
	public static void TestCasePrint2(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean bgboxsize = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	bgboxsize = false;
        }
        if (bgboxsize) {
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
	public static void TestCasePrint3(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean bgcursor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	bgcursor = false;
        }
        if (bgcursor) {
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

