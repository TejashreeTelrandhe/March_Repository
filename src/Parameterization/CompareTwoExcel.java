package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareTwoExcel {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\Group F.xlsx";
		FileInputStream file1 = new FileInputStream(path1);
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
		XSSFSheet sheet1 = workbook1.getSheetAt(0);
		int r1 = sheet1.getLastRowNum();
		System.out.println("Total row in sheet1 = " + r1);
		int c1 = sheet1.getRow(0).getLastCellNum();
		System.out.println("Total cell in sheet1 = " + r1);
		for (int i = 0; i < r1; i++) {
			XSSFRow R1 = sheet1.getRow(i);
			for (int j = 0; j < c1; j++) {
				String value1 = R1.getCell(j).toString();
				System.out.print(" | " + value1);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		String path2 = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\Group F.xlsx";
		FileInputStream file2 = new FileInputStream(path2);
		XSSFWorkbook workbook2 = new XSSFWorkbook(file2);
		XSSFSheet sheet2 = workbook2.getSheetAt(1);
		int r2 = sheet2.getLastRowNum();
		System.out.println("Total row in sheet1 = " + r1);
		int c2 = sheet2.getRow(0).getLastCellNum();
		System.out.println("Total cell in sheet1 = " + r1);
		for (int i = 0; i < r2; i++) {
			XSSFRow R2 = sheet1.getRow(i);
			for (int j = 0; j < c2; j++) {
				String value2 = R2.getCell(j).toString();
				System.out.print(" | " + value2);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < r1; i++) {
			XSSFRow row1 = sheet1.getRow(i);
			XSSFRow row2 = sheet2.getRow(i);

			for (int j = 0; j < c1; j++) {
				String cell1 = row1.getCell(j).toString();
				String cell2 = row2.getCell(j).toString();

				if (cell1.equals(cell2)) {
					// Handle different values
					System.out.println("two excel sheet matches");
				}
			}
		}
	}
}
