package extentReport.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacbookproPOM {

WebDriver driver;

public MacbookproPOM (WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//a[@id='ac-gn-link-search']")
WebElement click_searchbutton;
public WebElement searchbutton() {
	return click_searchbutton;
}
@FindBy(xpath="//input[@id='ac-gn-searchform-input']")


WebElement click_searchbox;
public WebElement searchbox() {
	return click_searchbox;
}

@FindBy(xpath="//*[@id=\"quicklinks\"]/li[1]/a")
WebElement product;
public WebElement productclick() {
	return product;
}
//*[@id="quicklinks"]/li[1]/a/b


@FindBy(xpath="//button[@id='ac-gn-searchform-submit']")
WebElement click_finalsearch;
public WebElement search() {
	return click_finalsearch;
}

@FindBy(xpath="//a[text()='MacBook Pro']")
WebElement click_product;
public WebElement product() {
	return click_product;
}

@FindBy(xpath="//a[@data-analytics-title='buy - macbook pro 14 and 16-inch']")
WebElement buyclick;
public WebElement buy() {
	return buyclick; 
}


@FindBy(xpath="//button[@data-autom='proceed-14inch-better']")
WebElement click_select;
public WebElement selectbutton() {
	return click_select;
}

@FindBy(xpath="//button[@class='button button-block']")
WebElement addbag;
public WebElement addtobagclick() {
	return addbag;
}

@FindBy(xpath="//button[@class='button button-block button-super']")
WebElement reviewbag;
public WebElement reviewbagclick() {
	return reviewbag;
}

@FindBy(xpath="//select[@class='form-dropdown-select']")
WebElement languageclick;
public WebElement arabicclick() {
	return languageclick;
}
@FindBy(xpath="//div[@data-autom='bagtotalvalue']")
WebElement click_price;
public WebElement price() {
	return click_price;
}

@FindBy(xpath="//div[@data-autom='bagtotalvalue']")
WebElement totalprice;
public WebElement lastcost() {
	return totalprice;
}
//*[@id="quicklinks"]/li[1]/a
//*[@id="quicklinks"]/li[1]/a/b




}



