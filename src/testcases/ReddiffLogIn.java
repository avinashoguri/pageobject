package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageobjects.RediffHomePageObjects;
import pageobjects.RediffLoginObjects;

public class ReddiffLogIn {
	
	
	
	
	@Test
	public void LogIn() {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Malempati Parvathi\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//ReddiffLogInObjects rd=new ReddiffLogInObjects(driver);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginObjects rd=new RediffLoginObjects(driver);
		
		rd.username().sendKeys("hello");
		rd.password().sendKeys("hello");
		rd.signin().click();
		
		RediffHomePageObjects rf=new RediffHomePageObjects(driver);
		
		rf.linktext().click();
		rf.searchtext().sendKeys("corona");
		rf.searchbutton().click();
		
	
		

		
	}

}
