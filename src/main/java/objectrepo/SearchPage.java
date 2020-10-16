package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumActions;

public class SearchPage extends SeleniumActions{
	
	WebDriver cdriver;
	
	public SearchPage(WebDriver driver) {
		this.cdriver = driver;
		PageFactory.initElements( cdriver, this);
	}

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement txtUsername;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement txtpswd;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement login;
	
	public void login() {
		Input( txtUsername, "7510599022");
		Input(txtpswd,"jimmy@123");
		Click( login );
	}
	
	
}
