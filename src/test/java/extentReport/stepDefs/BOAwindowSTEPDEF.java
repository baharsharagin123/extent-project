package extentReport.stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import extentReport.pageObjectModel.BOAwindowsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BOAwindowSTEPDEF {
	WebDriver driver;
	@Given("user visit bank of america home page")
	public void user_visit_bank_of_america_home_page() {
	    
	
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		

	
	
	
	
	
	
	
	
	}

	@When("user click on home loan and click on find a home and click on new construction")
	public void user_click_on_home_loan_and_click_on_find_a_home_and_click_on_new_construction() throws InterruptedException {
	    
		BOAwindowsPOM objv= new BOAwindowsPOM() ;
		Thread.sleep(2000);
	String a=driver.getWindowHandle();
		
		objv.clickhomeloan().click();
		objv.clickfindhome().click();
		Thread.sleep(2000);
		
		
		
			
			
			
			
		
	
	
	
	
	
	
	}

	@Then("user will be able to redirect in new window")
	public void user_will_be_able_to_redirect_in_new_window() {
	   
	
	
	
	
	
	
	
	
	
	}













}
