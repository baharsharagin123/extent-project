package extentReport.stepDefs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import extentReport.pageObjectModel.MacbookproPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MacbookproStepDef {

WebDriver driver;

	@Given("user apple home page")
	public void user_apple_home_page() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.apple.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    Thread.sleep(2000);
	
	
	
	
	
	}

	@When("user enter\"macbookpro\" and after getting add to bag select arabic language and click review bag")
	public void user_enter_macbookpro_and_after_getting_add_to_bag_select_arabic_language_and_click_review_bag() throws InterruptedException {
	
	
		MacbookproPOM obj9=new MacbookproPOM(driver);
		obj9.searchbutton().click();
		Thread.sleep(2000);
		obj9.searchbox().sendKeys("macbookpro");
	
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(obj9.productclick()).click().build().perform();
//		a.moveToElement(obj9.searchbox()).sendKeys("macbookpro")
	//	a.moveToElement(obj9.searchbox()).sendKeys("macbookpro").click().build().perform();
		obj9.search().click();
		Thread.sleep(2000);
		obj9.product().click();
		Thread.sleep(2000);
		obj9.buy().click();
		obj9.selectbutton().click();
		Thread.sleep(2000);
		Select b=new Select(obj9.arabicclick());
		b.selectByIndex(1);
		System.out.println(b.getFirstSelectedOption().getText());
		
		
		Thread.sleep(2000);
		obj9.addtobagclick().click();
		obj9.reviewbagclick().click();
		Thread.sleep(2000);
		obj9.price().getText();
		System.out.println("price");
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\apple\\saraa.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(),"Bag - Apple");
		//Assert.assertEquals(obj9.lastcost(),"2,176.41");
		
	
	
	
	
	}    

	@Then("user  will be able to redirect on  the total price page")
	public void user_will_be_able_to_redirect_on_the_total_price_page() {
	    
	
	
	
	
	
	
	}

















}
