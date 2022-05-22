package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleaddtocartPOM{

WebDriver driver;

public GoogleaddtocartPOM (WebDriver driver) {

this.driver = driver;
	
	PageFactory.initElements(driver, this);




}

@FindBy(xpath="//input[@class='gLFyf gsfi']")
WebElement  click_searchbox;
public WebElement searchbox() {
	return click_searchbox;
}



@FindBy(xpath="//button[text()='No thanks']")
WebElement signinclick;
public WebElement signin() {
	return signinclick;
}

@FindBy(xpath="//a[@class='M6CB1c yZqNl']")
WebElement click_signinn;
public WebElement signinnn() {
	return click_signinn;
}





}
