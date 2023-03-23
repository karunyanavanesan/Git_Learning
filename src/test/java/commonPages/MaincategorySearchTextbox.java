package commonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaincategorySearchTextbox {
	
	
	@FindBy(xpath = "//th[1]//div[1]//span[2]//span[1]//*[name()='svg']")
	public static WebElement SearchButton;
	
	@FindBy(xpath = "//input[@placeholder='Main Category']")
	public static WebElement SearchTextbox;

}
