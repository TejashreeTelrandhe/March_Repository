package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData5 {

public static void main(String[] args) throws IOException {
String path = "C:\\Users\\Tejashree\\Documents\\Sheet4.xlsx";
FileInputStream file = new FileInputStream (path);

XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheetAt(0);

int row = sheet.getLastRowNum();
System.out.println(row);
int column = sheet.getRow(0).getLastCellNum();
System.out.println(column);

for(int i=0;i<row;i++) {
	XSSFRow Currentrow = sheet.getRow(i);
	for(int j=0;j<column;j++) {
		String Value = Currentrow.getCell(j).toString();
		System.out.print(" | "+Value);
	}
	System.out.println();
}
}
}
