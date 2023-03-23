package commonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Master {

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement Master;
	
	@FindBy(xpath = "(//a[@href='#/master/materiallevel'])[1]")
	public static WebElement Materialclick;
	
	
	
}
