package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	//This method return a WebDriver object
	
	public static WebDriver open(String browserType){
		
		if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe" );
			System.out.println("using Firefox");
			return new InternetExplorerDriver();
		}
		else if(browserType.equalsIgnoreCase("IE")){
			System.out.println("using IE");
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe" );
			return new FirefoxDriver();
		}
		else{			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
			return new ChromeDriver();
		
		
	}

	}
}
