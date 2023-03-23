package testCases;

import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.DriverInitialization;
import commonPages.AddMatMain;
import commonPages.EditIconPage;
import commonPages.MaincategorySearchTextbox;

public class SearchTextbox extends DriverInitialization {

	
	static MaincategorySearchTextbox stb = new MaincategorySearchTextbox();
	
	@Test
	public void seachTextbox() {
		PageFactory.initElements(driver, stb);
		MaincategorySearchTextbox.SearchButton.click();
		MaincategorySearchTextbox.SearchTextbox.isDisplayed();
		
		MaincategorySearchTextbox.SearchTextbox.sendKeys("Gas");
	}
	
	
// background color of search Textbox
	@Test
	public void textboxColor() {
		PageFactory.initElements(driver, stb);
		String Actualtextboxcolor = MaincategorySearchTextbox.SearchTextbox.getCssValue("background-color");
		  System.out.println("textbox bgd color is "+Actualtextboxcolor);
		  String Expectedcolor = "rgba(255, 255, 255, 1)";
		  TestCasePrint("Check textbor bgrd color",Actualtextboxcolor,Expectedcolor);
		
		
	}
	public static void TestCasePrint(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean textboxbackgroundcolor = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textboxbackgroundcolor = false;
        }
        if (textboxbackgroundcolor) {
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
	public void textboxPosition() {
		Point ActualLocation = MaincategorySearchTextbox.SearchTextbox.getLocation();
		int  actual_x    = ActualLocation.getX();
		int  actual_y    = ActualLocation.getY();
		
		System.out.println("X axis is:"+actual_x);
		System.out.println("Y axis is:"+actual_y);
		
		Point actualLocation = new Point(actual_x,actual_y);
		Point ExpectedLocation = new Point(170,38);
		TestCasePrint1("Verify Point Search Textbox",ExpectedLocation,actualLocation);
		
	}
	public static void TestCasePrint1(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean textboxposition = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textboxposition = false;
        }
        if (textboxposition) {
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
	public void textboxSize() {
		
		Dimension ActualSize = MaincategorySearchTextbox.SearchTextbox.getSize();
		int  actual_width    = ActualSize.getWidth();
		int  actual_height    = ActualSize.getHeight();
		
		System.out.println("Width is:"+actual_width);
		System.out.println("Height is:"+actual_height);
		
		Dimension actualSize = new Dimension(actual_width,actual_height);
		Dimension ExpectedSize = new Dimension(188,32);
		TestCasePrint2("Verify size Search Textbox",ExpectedSize,actualSize);
	}
	
	
	public static void TestCasePrint2(String TestCaseName, Object ExpectedValue, Object ActualValue) {
        boolean textboxsize = true;
        ExtentTest testcase = extent.createTest(TestCaseName);
        try {
          AssertJUnit.assertEquals(ExpectedValue, ActualValue); 
        } catch (AssertionError e) {
        	textboxsize = false;
        }
        if (textboxsize) {
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





