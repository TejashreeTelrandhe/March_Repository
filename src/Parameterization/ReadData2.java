package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Tejashree\\Documents\\Sheet2.xlsx";
		
		//String path ="C:\\Users\\Tejashree\\Downloads\\Sheet3.xlsx";
		
		FileInputStream file = new FileInputStream(path);
				
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(data);
	}

}