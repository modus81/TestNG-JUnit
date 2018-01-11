package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNG {
	WebDriver driver;
	
	@Test
	public void loginElementsPresentTest() {
		
		System.out.println("Running test");		 
		
		
		boolean loginEmailText = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean passWordBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		
		Assert.assertTrue(loginEmailText,"Email textbox present");
		Assert.assertTrue(passWordBox, "Password textbox not present");
	}
	@BeforeMethod
	public void setUp() {
		String webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		System.out.println("Starting test");
		driver=utilities.DriverFactory.open("chrome");		
		driver.get(webUrl);
	}
	@AfterMethod
	public void tearDown(){
		System.out.println("Closing test");
		driver.close();
	}
	
}

