package extentReport.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import extentReport.pageObjectModel.DelladdPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellAddStepDef {


WebDriver driver;


@Given("user visit dell home page")
public void user_visit_dell_home_page() throws InterruptedException {
   

	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	driver.manage().window().maximize();
	Thread.sleep(5000); 




}

@When("user click on {string}")
public void user_click_on(String string) throws InterruptedException {

	DelladdPOM obj7=new DelladdPOM(driver);
	
	obj7.shop().click();
	obj7.addtocartlap().click();
	
	//Thread.sleep(2000);
	//obj7.addproduct().click();
	
	




}

@Then("user will be able to land the page")
public void user_will_be_able_to_land_the_page() {
   







}
}
