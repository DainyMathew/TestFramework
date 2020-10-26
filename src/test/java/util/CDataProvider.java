package util;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class CDataProvider extends GetData {

	@DataProvider( name = "DP1")
	public Object[][] read4V() throws InvalidFormatException, IOException {
		
				return readExcel_CustomRange("TestData//Form.xlsx","TestData",1,1,2,2);
		
	}
	
}
