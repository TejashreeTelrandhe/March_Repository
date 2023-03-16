package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Sheet2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wbook = new XSSFWorkbook(file);
		XSSFSheet sheet = wbook.getSheetAt(1);
		int row = sheet.getLastRowNum();
		System.out.println("Total number of rows : " + row);
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cells : " + cell);

		for (int i = 0; i <= row; i++) {
			XSSFRow ROW = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				XSSFCell CELL = ROW.getCell(j);
				switch (CELL.getCellType()) {
				case STRING:
					System.out.print(CELL.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(CELL.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.print(CELL.getNumericCellValue());
					break;
				default:
					System.out.print("Value not matches");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
