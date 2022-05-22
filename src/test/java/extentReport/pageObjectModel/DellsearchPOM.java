package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsearchPOM {

WebDriver driver;
	
	public DellsearchPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}


@FindBy(xpath="//input[@id='mh-search-input']")
WebElement searchbar;
public WebElement click_search() {
	return searchbar;
}

@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[1]/div[2]/button[2]/svg")
WebElement searchbutton;
public WebElement clickbutton() {
	return searchbutton;
}

















}
