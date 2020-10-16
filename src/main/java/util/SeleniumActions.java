package util;

import org.openqa.selenium.WebElement;

public class SeleniumActions {

         public void Click(WebElement Obj) {
		try {
		    Obj.click();
		}
		catch(Exception e) {
			System.out.println( " Fault" );
		}
	
	}
         
       public void Input(WebElement Obj,String text)  {
    	   try {
   		    Obj.sendKeys(text);
   		}
   		catch(Exception e) {
   			System.out.println( " Fault" );
   		}
    	   
       }
         
         
}


