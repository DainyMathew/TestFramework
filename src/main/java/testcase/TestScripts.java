package testcase;

import org.testng.annotations.Test;

import basetest.CommonScript;
import objectrepo.HomePage;
import objectrepo.SearchPage;

public class TestScripts extends CommonScript{
	
	@Test
	public void test01() {
		HomePage hpage = Openurl();
		hpage.login();
		SearchPage spage = hpage.Search("Mobiles");
	}
	

}
