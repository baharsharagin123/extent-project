package extentReport.stepDefs;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import extentReport.pageObjectModel.DellPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellStepDef  {

	WebDriver driver;
	
	@Given("user have access to dell home page")
	public void user_have_access_to_dell_home_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.dell.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    Assert.assertEquals(driver.getTitle(), "Computers, Monitors & Technology Solutions | Dell USA");
	    
	}

	@When("user enters {string} in the search box")
	public void user_enters_in_the_search_box(String search_word) throws InterruptedException {
	   DellPOM dell = new DellPOM(driver);
	   
	   dell.SearchBox_typeable().sendKeys(search_word);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Actions a= new Actions(driver);
	
	Thread.sleep(2000);
	a.moveToElement(dell.SearchBox_typeable()).keyDown(Keys.SHIFT.CONTROL.ARROW_DOWN).click();
	   dell.Search_button_click().click();
	}

	@Then("the user redirects to search page")
	public void the_user_redirects_to_search_page() {
		
	
		
		
		
		
		
		
		
		
		
		try {
	    Assert.assertEquals(driver.getTitle(), "Dell Search");
		}
		catch(Exception e) {
			System.out.println("catch" + e.getMessage());
		}
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  
	    driver.quit();
	    
	  
	   
	    
	}

	
	

}
