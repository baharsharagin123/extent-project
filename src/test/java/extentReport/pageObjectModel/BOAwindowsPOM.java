package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BOAwindowsPOM {

WebDriver driver;

public BOAwindowsPOM () {
	
	
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"navHomeLoans\"]/span[3]")
WebElement homeloan;
public WebElement clickhomeloan() {
	return homeloan;
}


@FindBy(xpath="//a[@id='findAHome']")
WebElement findhome;
public WebElement clickfindhome() {
	return findhome;
}











}
