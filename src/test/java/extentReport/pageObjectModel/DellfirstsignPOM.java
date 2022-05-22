package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellfirstsignPOM {

	

		WebDriver driver;
			
			public DellfirstsignPOM(WebDriver driver) {
				this.driver = driver;
				
				PageFactory.initElements(driver, this);
				
			}



@FindBy(xpath="//input[@id='SignInModel_EmailAddress']")
WebElement type_email;
public WebElement firstemail() {
	return type_email;
}


@FindBy(xpath="//input[@id='userPwd_UserInputSecret']")
WebElement type_pass;
public WebElement firstpass() {
	return type_pass;
}

@FindBy(xpath="//input[@id='btnSignIn']")
WebElement click_lastsignin;
public WebElement lastsignin() {
	return click_lastsignin;
}

@FindBy(xpath="//h2[@class='hpg-card-copy-headline dds__h2 dds__mt-2']")
WebElement text;
public WebElement textvisible() {
	return text;
}


}
