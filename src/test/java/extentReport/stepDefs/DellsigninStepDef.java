//package extentReport.stepDefs;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import extentReport.pageObjectModel.DellsigninPOM;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DellsigninStepDef {
//
//
//
//WebDriver driver;
//
//
//@Given("user visit dell home page")
//	public void user_visit_dell_home_page() throws InterruptedException {
//	    
//	
//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//    driver = new ChromeDriver();
//    
//    driver.get("https://www.dell.com");
//   Thread.sleep(2000);
//
//
//}
//
//	@When("user enter {string} and {string} and valid {string} and {string}")
//	public void user_enter_and_and_valid_and(String string, String string2, String string3, String string4) throws InterruptedException {
//	    
//	
//		DellsigninPOM obj5= new DellsigninPOM(driver);
//		Actions b=new Actions(driver);
//		b.moveToElement(obj5.dellfirstsign()).build().perform();
//		Thread.sleep(2000);
//		b.moveToElement(obj5.firstcreateaccount()).click().build().perform();
//		Thread.sleep(2000);
//		obj5.dellname().sendKeys(string);
//		obj5.delllastname().sendKeys(string2);
//		obj5.dellemail().sendKeys(string3);
//		obj5.pass().sendKeys(string4);
//		Thread.sleep(2000);
//		obj5.accountcreate().click();
//		
//		
//		
//	
//		
////		b.moveToElement(obj5.dellname()).sendKeys(string).build().perform();
////		Thread.sleep(2000);
////		b.moveToElement(obj5.delllastname()).sendKeys(string2).build().perform();
////		b.moveToElement(obj5.dellemail()).sendKeys(string3).build().perform();
////		b.moveToElement(obj5.pass()).sendKeys(string4).build().perform();
//		
//		
//		
//		
//	
//	}
//
//	@Then("user click on create account")
//	public void user_click_on_create_account() {
//	    
//	
//	
//	
//	
//	}
//}
