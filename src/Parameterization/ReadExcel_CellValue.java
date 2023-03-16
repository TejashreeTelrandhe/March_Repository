package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel_CellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//   Parameterization : Fetching data from external source and using it in selenium 
//	 test script is known as parameterization.

		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\StudentData.xlsx";

		FileInputStream file = new FileInputStream(path);

//		Indexing of row starts with 0 and that of column starts with 0
		System.out.println("To fetch string type of information we need to call "
				+ "getStringCellValue() method having retirn type String");
		
//		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//      System.out.println("Value stored at 0th row 0th column = " + value);

//		String value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
//		System.out.println("Value stored at 3rd row 0th column = " + value1);
		
		System.out.println();

		System.out.println("To fetch numeric type of information we need to call "
				+ "getNumericCellValue() method having retirn type double");
		
//		double marks = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(5).getNumericCellValue();
//		System.out.println("Numeric data at 3rd row and 5th column = "+marks);
		
		System.out.println();
		
		System.out.println("To fetch boolean type of information we need to call "
				+ "getBooleanCellValue() method having retirn type boolean");
		
		boolean result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(7).getBooleanCellValue();

		System.out.println("Boolean value at 3rd row 7th column = " + result);

	}

}
