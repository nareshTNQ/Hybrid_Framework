/**
 * 
 */
package ExcelProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @author 9395
 *
 */
public class ExcelData {
	
	public static XSSFWorkbook wb;
		
	public ExcelData() {
		
		try {
			wb = new XSSFWorkbook("C:/Users/9395/Desktop/Automation/HybridFramework/testFrame.xlsx");
		} catch (Exception e) {
			System.out.println("Unable to load excel file");
			System.out.println(e.getMessage());
		}	
		
		
	}
	
	public String getData(int sheetname, int row, int column){
		
		String data = wb.getSheetAt(sheetname).getRow(row).getCell(column).toString();	
				
		return data;
			
	}
	
	public int rowCount(int sheetname){
		
		return wb.getSheetAt(sheetname).getLastRowNum();	
		  
		
	}
	
}
