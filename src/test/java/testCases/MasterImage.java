package testCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.MasterImagePage;

public class MasterImage extends DriverInitialization {
	
	static MasterImagePage mai = new MasterImagePage();
	
	@Test
	public void masterImage() {
		PageFactory.initElements(driver, mai);
		MasterImagePage.Masterimages.isDisplayed();

		// check Master Image size
		 
		Dimension ActualSize = MasterImagePage.Masterimages.getSize();
		int  actual_width    = ActualSize.getWidth();
		int  actual_Height    = ActualSize.getHeight();
		
		System.out.println("width is:"+actual_width);
		System.out.println("height is:"+actual_Height);
		
		Dimension actualsize = new Dimension(actual_width,actual_Height);
		Dimension Expectedsize = new Dimension(55,55);
		TestCasePrint("check image size",Expectedsize,actualsize);
		
		 String Actualbgcolor = MasterImagePage.Masterimages.getCssValue("color");
		 System.out.println("Text is Visible"+Actualbgcolor);
		 String Expectedbgcolor = "rgba(220, 220, 220, 1)";
		 TestCasePrint1("Verify image color",Actualbgcolor,Expectedbgcolor);
		  
	}
	
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean imagesize = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	imagesize = false;
        }
        if (imagesize) {
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


}


