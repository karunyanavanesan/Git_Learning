package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.TextPage;

public class Texttest extends DriverInitialization {
	
	static TextPage tp = new TextPage();
	
	
	@Test
	public void materialMainText() {
		
		PageFactory.initElements(driver, tp);
		TextPage.MaterialMainText.isDisplayed();
		
		// check material main category  text visible
		  boolean EditIconVisible =	TextPage.MaterialMainText.isDisplayed();
		  System.out.println("Text is Visible"+EditIconVisible);
		  boolean ExpectedbuttonVisible = true;
		  TestCasePrint("Verify text visiblity",EditIconVisible,ExpectedbuttonVisible);
		
		  
		// check material main category  font color
		  String ActualTextcolor =	TextPage.MaterialMainText.getCssValue("color");
		  System.out.println("Text is Visible"+ActualTextcolor);
		  String ExpectedTextcolor = "rgba(0, 0, 0, 0.85)";
		  TestCasePrint1("Verify text color",ActualTextcolor,ExpectedTextcolor);
		  
		// check material main category  font family
		  String ActualTextfontfamily =	TextPage.MaterialMainText.getCssValue("font-family");
		  System.out.println("Text is Visible"+ActualTextfontfamily);
		  String Expectedfontfamily = "Roboto, sans-serif";
		  TestCasePrint2("Verify text font family",ActualTextfontfamily,Expectedfontfamily);
		  
		// check spelling of material main category  
		  String ActualText =	TextPage.MaterialMainText.getText();
		  System.out.println("Text is Visible"+ActualText);
		  String ExpectedText = "Material Main Category";
		  TestCasePrint3("Verify spelling of text",ActualText,ExpectedText);
		  
			// check padding of material main category  
		  String ActualTextpadding =	TextPage.MaterialMainText.getCssValue("padding");
		  System.out.println("Text is Visible"+ActualTextpadding);
		  String ExpectedTextpadding = "10px";
		  TestCasePrint4("Verify spelling of text",ActualTextpadding,ExpectedTextpadding);
		
	}
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean textVisible = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textVisible = false;
        }
        if (textVisible) {
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
        boolean textcolor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textcolor = false;
        }
        if (textcolor) {
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
        boolean textfontfamily = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textfontfamily = false;
        }
        if (textfontfamily) {
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
        boolean text = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	text = false;
        }
        if (text) {
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
	public static void TestCasePrint4(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean textpadding = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textpadding = false;
        }
        if (textpadding) {
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
