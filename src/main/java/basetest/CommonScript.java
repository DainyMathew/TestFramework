package basetest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepo.HomePage;


public class CommonScript {
 
	
	WebDriver  driver;
	@Test
	
	public HomePage Openurl(){
	      System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      String url= "https://www.flipkart.com/";
	      driver.get(url);
	      return PageFactory.initElements( driver, HomePage.class);
          }
	
}