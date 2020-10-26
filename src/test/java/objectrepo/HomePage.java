package objectrepo;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;

import util.SeleniumActions;

public class HomePage extends SeleniumActions{
	
	WebDriver cdriver;
	
	public HomePage(WebDriver driver) {
		this.cdriver = driver;
		PageFactory.initElements( cdriver, this);
	}

		
	
	public PracticeForm login() {
		PageUrl(cdriver,"https://demoqa.com/forms");
		return PageFactory.initElements( cdriver,  PracticeForm.class);
	}
	

	
}
