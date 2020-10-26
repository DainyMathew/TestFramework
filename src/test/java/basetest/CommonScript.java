package basetest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import objectrepo.HomePage;


public class CommonScript {
 
	
	WebDriver  driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers//chromedriver.exe");
		// WebDriverManager.chromedriver();
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	}
	
		
	

	public HomePage Openurl(){
	     
	      
	      String url= "https://demoqa.com/";
	      driver.get(url);
	      return PageFactory.initElements( driver, HomePage.class);
          }
	
}