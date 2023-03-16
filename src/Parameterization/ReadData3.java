package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tejashree\\Documents\\Sheet1.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet Sheet = workbook.getSheetAt(0);

		int Row = Sheet.getFirstRowNum();

		System.out.println(Row);

		int Column = Sheet.getRow(0).getLastCellNum();

		System.out.println(Column);

//Using for loop

		for (int i = 0; i <= Row; i++) {

			XSSFRow Row1 = Sheet.getRow(i); // 0

			for (int j = 0; j < Column; j++) {

				XSSFCell Cell = Row1.getCell(j);

				switch (Cell.getCellType()) {

				case STRING:
					System.out.print(Cell.getStringCellValue());
					break;

				case NUMERIC:
					System.out.print(Cell.getNumericCellValue());
					break;

				case BOOLEAN:
					System.out.print(Cell.getBooleanCellValue());
					break;

				}

				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
