package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String Path = "C:\\Users\\Tejashree\\Documents\\Sheet1.xlsx";

		FileInputStream file = new FileInputStream(Path);

		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

        //String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

		System.out.println(data);

        //System.out.println(data1);
	}

}
