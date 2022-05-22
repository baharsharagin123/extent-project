package extentReport.stepDefs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import extentReport.pageObjectModel.DellmouseoverPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellmouseoverStepDef {

WebDriver driver;


	@Given("user visit Dell home page")
	public void user_visit_dell_home_page() throws InterruptedException {
	   

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(5000); 


	
	}

	@When("user  mouse over on about us and go to what we do and go to customer stories and click")
	public void user_mouse_over_on_about_us_and_go_to_what_we_do_and_go_to_customer_stories_and_click() throws InterruptedException {
	   
		DellmouseoverPOM obj3=new DellmouseoverPOM(driver);
		Actions o=new Actions(driver);
		o.moveToElement(obj3.aboutus()).build().perform();
		Thread.sleep(2000);
		o.moveToElement(obj3.nextaboutus()).build().perform();
		Thread.sleep(2000);
		o.moveToElement(obj3.lastcusstory()).click().build().perform();
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src,new File("C:\\itscreenshot\\sara.png"));//under c drive in itscreenshot folder created sar.png file 
			//and inside the file screenshot
			//here itscreenshot is folder and sara.png is file nmae (u can putany filename)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("could not create file"+ e.getMessage());
		
		}
	
		
		
		
		
		//if try block fail it will go to catch block and we can see the error	
		//error handling
	
		
//		String screenShot_time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		   String fileType = ".png";
//		   String screenShotFileName = screenShot_time + fileType;
//		   TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
//		   File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
//		   File destFile = new File("./Screenshots/" + screenShotFileName);
//		   
//		   try {
//			FileUtils.copyFile(sourceFile, destFile);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	
//	C:\sara2\\
	
	}

	@Then("user will be able to land on customer stories page")
	public void user_will_be_able_to_land_on_customer_stories_page() throws InterruptedException {
	   
		DellmouseoverPOM obj4=new DellmouseoverPOM(driver);
		System.out.println(obj4.lastctitle().getText());
		Thread.sleep(2000);
				
		Assert.assertEquals(obj4.lastctitle().getText(),"Customer Success Stories");
		

				
				
				
				
	
	
	
	
	
	
	
	
	
	}
























}
