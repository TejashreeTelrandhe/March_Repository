package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet_toStringMethod {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\StudentData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int row = sheet.getLastRowNum();
		System.out.println("Total number of rows = " + row);
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cells = " + cell);

		for (int i = 0; i <= row; i++) {
			XSSFRow row1 = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				String data = row1.getCell(j).toString();
				System.out.print(" | " + data);
			}
			System.out.println();
		}

	}

}
