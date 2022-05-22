package extentReport.stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import extentReport.pageObjectModel.DellfirstsignPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellfirstsignStepDef {


WebDriver driver;

	@Given("user click contact page")
	public void user_click_contact_page() throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(5000); 


	
	
	
	}

@When("user enter {string} and valid {string} and click sign in")
	public void user_enter_and_valid_and_click_sign_in(String string, String string2) throws InterruptedException {
	DellfirstsignPOM obj6= new DellfirstsignPOM(driver);
	obj6.firstemail().sendKeys(string);
	Thread.sleep(2000);
	obj6.firstpass().sendKeys(string2);
	obj6.lastsignin().click();
Boolean webelement =obj6.textvisible().isDisplayed();



}
@Then("user will be able to land sign in page")
	public void user_will_be_able_to_land_sign_in_page() {
	   
	









}
}
