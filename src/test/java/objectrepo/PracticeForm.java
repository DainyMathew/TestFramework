package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import util.SeleniumActions;

public class PracticeForm extends SeleniumActions{
	
	WebDriver cdriver;
	
	public PracticeForm(WebDriver driver) {
		this.cdriver = driver;
		PageFactory.initElements( cdriver, this);
	}

	@FindBy(id="firstName")
	WebElement Fname;
	@FindBy(id="lastName")
	WebElement Lname;
	@FindBy(id="react-select-3-input")
	WebElement State;
	
	
	@FindBy( xpath="//div[text()='Select State']")
	WebElement ddSelectState;
	
	
	@FindBy(xpath="//*[@id=\"react-select-3-option-0\"]")
	WebElement Stateclick;
	
	@Test(dataProviderClass=util.CDataProvider.class, dataProvider="DP1")
//	public void testMe0(String a, String b, String c) throws InvalidFormatException, IOException {
//		System.out.println(a + b + c);
//	}
	
	public  void EnterForm(String FirstName, String LastName) {
		PageUrl(cdriver,"https://demoqa.com/automation-practice-form");
		Input(Fname,FirstName);
		Input(Lname,LastName);
		PageScroll(cdriver);

		
		Click(ddSelectState);
		Click(Stateclick);
//		return PageFactory.initElements( cdriver, PracticeForm.class );
		
	}

	
	
	
}
