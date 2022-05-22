package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelladdPOM {


	WebDriver driver;
		
		public DelladdPOM(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}
@FindBy(xpath="//*[@id=\"product-1\"]/div[2]/div/div[2]/a[1]")
WebElement click_shopnow;
public WebElement shop() {
	return click_shopnow;
}

@FindBy(xpath="//a[text()='XPS 13 Plus Laptop']")
WebElement addcart;
public WebElement addproduct() {
	 return addcart;
}

@FindBy(xpath="//*[@id=\"add-to-cart-stack\"]/div[2]/a")
WebElement laptop;
public WebElement addtocartlap() {
	return laptop;
}
	



}
