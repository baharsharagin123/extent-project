package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsigninPOM {


WebDriver driver;
	
	public DellsigninPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}


	
	
	
	@FindBy(xpath="//span[@id='um-si-label']")
	WebElement dellsignin;
	public WebElement dellfirstsign() {
		return dellsignin;
	}
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[3]/div[2]/a[2]")
	WebElement createaccount;
	public WebElement firstcreateaccount() {
		return createaccount;
	}
	
	
	
@FindBy(xpath="//input[@id='FirstName']")
WebElement firstname;
public WebElement dellname() {
	return firstname;
}

@FindBy(xpath="//input[@id='LastName']")
WebElement lastname;
public WebElement delllastname() {
	return lastname;
}


@FindBy(xpath="//input[@id='EmailAddress']")
WebElement emailaddress;
public WebElement dellemail() {
	return emailaddress;
}

@FindBy(xpath="//input[@id='userPwd_UserInputSecret']")
WebElement password;
public WebElement pass() {
	
	return password;
}

@FindBy(xpath="//input[@id='btnCreateAccount']")
WebElement click_account;
public WebElement accountcreate() {
	return click_account;
}

@FindBy(xpath="//a[text()='Inspiron 15 Laptop']")
WebElement click_laptop;
public WebElement laptop() {
	return click_laptop;
}




}
