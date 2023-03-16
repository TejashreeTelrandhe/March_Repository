package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData4 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tejashree\\Documents\\Sheet4.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int Row = sheet.getLastRowNum(); // indexing

		int Cell = sheet.getRow(2).getLastCellNum();

		for (int r = 0; r < Row; r++) {
			XSSFRow Row1 = sheet.getRow(r);
			for (int c = 0; c < Cell; c++) {
				XSSFCell Cell1 = Row1.getCell(c);
				switch (Cell1.getCellType()) {
				case STRING:
					System.out.print(Cell1.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(Cell1.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(Cell1.getBooleanCellValue());
					break;
				default:
					System.out.println("Hello");
				}
				System.out.println(" | ");
			}
			System.out.println();
		}
}
}