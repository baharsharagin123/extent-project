package extentReport.stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import extentReport.pageObjectModel.AmazonstroyPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonstoryStepDef {
WebDriver driver;
 
	@Given("user visit amazon home page")
	public void user_visit_amazon_home_page() throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	
	
	
		
		//*[@id="nav-flyout-searchAjax"]/div[2]/div[1]/div/div
	
	}

	@When("user enter {string} and click on search icon and click book and click add to cart")
	public void user_enter_and_click_on_search_icon_and_click_book_and_click_add_to_cart(String string) throws InterruptedException {
	   
	
		AmazonstroyPOM obj8=new AmazonstroyPOM(driver);
		obj8.searchbox().click();
		Thread.sleep(2000);
		obj8.searchbox().sendKeys(string);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(obj8.book()).click().build().perform();//this action is for mouse over
		
		//a.moveToElement(obj8.searchbox()).keyDown(Keys.SHIFT).sendKeys(string).build().perform();this is normal straight
		obj8.submittclick().click();
		Thread.sleep(2000);
		obj8.booklastt().click();
		Thread.sleep(2000);
		obj8.addcart().click();
		Thread.sleep(2000);
	Boolean webelement=	obj8.vitext().isDisplayed();
		obj8.gettext().getText();
	
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src,new File("C:\\Users\\bahar\\OneDrive\\Desktop\\sarascreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	
	
	}

	@Then("user will be able to add book in the cart")
	public void user_will_be_able_to_add_book_in_the_cart() {
	    
	
	
	
	
	
	
	
	
	
	}











}
