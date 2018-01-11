package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJUnit {
	//Declare variables and objects at CLASS level in order to access method throughout program
	WebDriver driver;
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

	
	@Test
	public void pageTitleTest(){
		System.out.println("Running test");	    
		driver.get(webURL);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "SDET Training | Account Management";		
		Assert.assertEquals(expectedTitle,  actualTitle);	
		
	}

	//This annotaion runs before the test above
	@Before
		public void setUp() {
		 
		 System.out.println("Initializing the variable");
		 driver = utilities.DriverFactory.open("chrome");
	}
	@After	
		public void tearDown(){
			System.out.println("closing driver");
			driver.close();			
		
  }		
}
