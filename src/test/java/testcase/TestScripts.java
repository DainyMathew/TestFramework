package testcase;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import basetest.CommonScript;
import objectrepo.HomePage;
import objectrepo.PracticeForm;
import util.CDataProvider;
import util.GetData;

public class TestScripts extends CommonScript{
	
	@Test( dataProvider = "DP1", dataProviderClass=CDataProvider.class)
	public void test01(String fname, String lname) throws InvalidFormatException, IOException {
		
		
		System.out.println( fname );
		HomePage hpage = Openurl();
		
		PracticeForm fpage = hpage.login();
		fpage.EnterForm( fname, lname);
		
		///C:\Users\JIMMY\Postman\files\test.txt
		
		//spage.ItemView();
	}
	

}
