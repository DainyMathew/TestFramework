package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumActions {

// To Perform Click 
	public void Click(WebElement Obj) {
		try {
		    Obj.click();
		}
		catch(Exception e) {
			System.out.println( " Fault" );
		}
	
	}
         
//  To enter values in textbox
	public void Input(WebElement Obj,String text)  {
    	   try {
   		    Obj.sendKeys(text);
   		}
   		catch(Exception e) {
   			System.out.println( " Fault" );
   		}
    	   
       }
         
   // To navigate to particular page    
       public void PageUrl(WebDriver driver,String text)  {
    	   try {
    		   driver.navigate().to(text);
   		}
   		catch(Exception e) {
   			System.out.println( " Fault" );
   		}
    	   
       }
       
  
       // select dropdown value  
       public void dropdown(WebElement Obj,String text)  {
    	   try {
    		   Select d = new Select(Obj);  
    		   d.selectByVisibleText(text);  
    		   d.selectByIndex(1);
    		   
   		}
   		catch(Exception e) {
   			System.out.println( " Fault" );
   		}
    	   
       }
       
       //to do Pagescroll
       public void PageScroll(WebDriver driver)  {
    	   try {
    		   JavascriptExecutor js = ((JavascriptExecutor) driver);
    		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");  
   		}
   		catch(Exception e) {
   			System.out.println( " Fault" );
   		}
    	   
       }
       
		
}


