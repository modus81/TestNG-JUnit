package smoketests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
WebDriver driver;
		
		@Test
		public void loginElementsPresentTest() {
		    System.out.println("Running test");	
		    boolean createAccountPresent =false; 
		    
		    // We want to test the presence of A tags >> hyperlinks
		   List <WebElement> aElements = driver.findElements(By.tagName("a"));
		   int numberOfAElements = aElements.size();
		   System.out.println("There are " + numberOfAElements + " on the page");
		   
		   for (WebElement aElement : aElements){
			   System.out.println(aElement.getText());			  
			   if (aElement.getText().equals("CREATE ACCOUNT")){
				   createAccountPresent = true;
				   break;
			   }
		   }
		   //Assertion
		   Assert.assertTrue(createAccountPresent);
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
	  
  
