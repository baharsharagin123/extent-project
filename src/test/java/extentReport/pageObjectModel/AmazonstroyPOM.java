package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonstroyPOM {








	WebDriver driver;
	
	public  AmazonstroyPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbar;
	public WebElement searchbox() {
		return searchbar;
	}

	@FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[1]/div/div")
	WebElement bookpick;
	public WebElement book() {
		return bookpick;
	}
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
WebElement addtocart;
	public WebElement addcart() {
		return addtocart;
	}
	
	
	
@FindBy(xpath="//*[@id=\"contentGrid_902455\"]/div/div/div[1]/div/div/a/img")
WebElement text;
public WebElement gettext() {
	return text;
}
@FindBy(xpath="//*[@id=\"fOg3EBQOC7EJvK6SlFO7Gw\"]/div[1]/h2/span/span[2]")
WebElement visibletext;
public WebElement vitext() {
	return visibletext;
}


	
	
	

	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement buttonclick;
	public WebElement submittclick() {
		return buttonclick;
	}



@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
WebElement booklast;
public WebElement booklastt() {
	return booklast;
}

}
