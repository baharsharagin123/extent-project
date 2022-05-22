package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellmouseoverPOM {


WebDriver driver;
	
	public DellmouseoverPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath="//span[text()='About Us']")
WebElement mouseoveraboutus;
public WebElement aboutus() {
	return mouseoveraboutus;
}


@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/ul/li[3]/a")
WebElement nextabout;
public WebElement nextaboutus() {
	return nextabout;
}


@FindBy(xpath="//a[text()='Customer Stories']")
WebElement cusstory;
public WebElement lastcusstory() {
	return cusstory;
}


@FindBy(xpath="//h1[text()='Customer Success Stories']")
WebElement  lasttitle;
public WebElement lastctitle() {
	return lasttitle;
}






}
