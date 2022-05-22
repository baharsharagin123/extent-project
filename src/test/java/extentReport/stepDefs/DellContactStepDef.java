//package extentReport.stepDefs;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import extentReport.pageObjectModel.DellContactPOM;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DellContactStepDef {
//	
//	WebDriver driver;
//	
//	@Given("user click contact page")
//	public void user_click_contact_page() {
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//	    driver = new ChromeDriver();
//	    
//	    driver.get("https://www.dell.com");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	    Assert.assertEquals(driver.getTitle(), "Computers, Monitors & Technology Solutions | Dell USA");
//	    
//	}
//
//	@When("user redirected to contact page")
//	public void user_redirected_to_contact_page() {
//		DellContactPOM contactPage = new DellContactPOM(driver);
//		contactPage.contactClick();
//		// Assert.assertEquals(driver.getTitle(), "Contact Us | Dell United States");
//	    
//	}
//
//	@Then("user see Get Tech IT Help")
//	public void user_see_get_tech_it_help() {
//		
//		System.out.println("then section");
//	    
//	}
//
//
//}
