package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellPOM {

	WebDriver driver;
	
	public DellPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='mh-search-input']")
	WebElement searchBox_typeable;
	
	@FindBy(xpath="//button[@class='mh-search-btn mh-search-submit']")
	WebElement search_icon;
	
	public WebElement SearchBox_typeable() {
		
		return searchBox_typeable;	
	}
	
	public WebElement Search_button_click() {
		return search_icon;
	}
}
