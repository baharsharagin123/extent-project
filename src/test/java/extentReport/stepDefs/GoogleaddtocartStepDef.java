package extentReport.stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import extentReport.pageObjectModel.GoogleaddtocartPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleaddtocartStepDef {

	WebDriver driver;
	
	
	@Given("user visit google home page")
	public void user_visit_google_home_page() {
	    
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    
		
	}

	@When("user click on search box and enter\"camera\" and click search icon")
	public void user_click_on_search_box_and_enter_camera_and_click_search_icon() throws InterruptedException {
	   
		GoogleaddtocartPOM var=new GoogleaddtocartPOM(driver);
		Thread.sleep(2000);
		
		var.signinnn().click();
		
		
		 
		
		
	//	var.signin().click();
		
		var.searchbox().click();
		Actions a= new Actions(driver);
		a.moveToElement(var.searchbox()).sendKeys("camera").keyDown(Keys.SHIFT.ARROW_DOWN).click().build().perform();
		
			
			
			
		}
	    
	    
	    
	

	@Then("user will be redirecting to the add to cart page")
	public void user_will_be_redirecting_to_the_add_to_cart_page() {
	   
		
		
		
	}





}
