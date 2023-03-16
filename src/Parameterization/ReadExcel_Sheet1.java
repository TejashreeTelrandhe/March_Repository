package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Sheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int row = sheet.getLastRowNum();
		System.out.println("Total number of rows = " + row);

		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cells = " + cell);

		System.out.println("Read excel using for loop");
		for (int i = 0; i <= row; i++) {
			XSSFRow row1 = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				XSSFCell cell1 = row1.getCell(j);

				switch (cell1.getCellType()) {
				case STRING:
					System.out.print(cell1.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell1.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.print(cell1.getNumericCellValue());
					break;
				default:
					System.out.print("Data doesn't matches");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
