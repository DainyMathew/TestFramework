package util;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	
	public Object[][] readExcel_CustomRange(String fileName, String sheetName, int startRow, int startCol,  int endRow, int endCol) throws InvalidFormatException, IOException{
		Object[][] data = new String[endRow - startRow][endCol - startCol];
		int x=0, y=0;
		XSSFWorkbook xwb = new XSSFWorkbook(new File(fileName));
		XSSFSheet xsheet = xwb.getSheet(sheetName);
		for(int i=startRow-1; i<endRow;++i) {
			Row row = xsheet.getRow(i);
			for(int j=startCol-1;j<endCol;++j) {
				Cell cell = row.getCell(j);
				switch(cell.getCellType()) {
				case NUMERIC:
					data[x][y] = String.valueOf(cell.getNumericCellValue());
					y++;
					break;
				case STRING:
					data[x][y] = cell.getStringCellValue();
					y++;
					break;
					
				default:
					break;
				
				}
			}
			x++;
		}
		xwb.close();
		
		return data; 
	}
	
}
