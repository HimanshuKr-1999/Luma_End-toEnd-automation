package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLXSData {
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ReadXLXSData red= new ReadXLXSData();
//		red.getdata("login");
//	}
//	
	@DataProvider(name="ExcelData")
	public String[][] getdata(Method m) throws EncryptedDocumentException, IOException {
		String excelSheetName=m.getName();                   
		File f = new File(System.getProperty("user.dir")+"//src\\test\\resources\\testdata\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheetName=wb.getSheet(excelSheetName);
		
		int totalRows = sheetName.getLastRowNum();
		System.out.println(totalRows);
		Row rowCells = sheetName.getRow(0);
		int totalColumn = rowCells.getLastCellNum();
		System.out.println(totalColumn);
		
		
		DataFormatter format = new DataFormatter();
		
		String testData[][]= new String[totalRows][totalColumn];
		
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalColumn;j++) {
				testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		
		return testData;
		
	}

}
