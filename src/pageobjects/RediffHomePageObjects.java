package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePageObjects {
	

	WebDriver driver;
	 public RediffHomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='f12']")
		WebElement linktext;
	
	@FindBy(id="srchword")
	WebElement searchtext;
	
	@FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
	WebElement searchbutton;
	
	public WebElement linktext() {
		return linktext;
	}
	public WebElement searchtext() {
		return searchtext;
	}
	public WebElement searchbutton() {
		return searchbutton;
	}
	
	

}
