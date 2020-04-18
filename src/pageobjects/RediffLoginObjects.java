package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginObjects {
	
	WebDriver driver;
	

	public RediffLoginObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="login")
		WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement signin;
	
	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	public WebElement signin() {
		return signin;
	}
}
