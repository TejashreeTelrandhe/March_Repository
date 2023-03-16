package Guru99_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getrowcount(String excelfile, String excelsheet) throws IOException {
		fi = new FileInputStream(excelfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(excelsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}

	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}

	public static String readExcelData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		String filedata;
		try {
			DataFormatter format = new DataFormatter();
			String celldata = format.formatCellValue(cell);
			return celldata;
		} catch (Exception e1) {
			filedata = "";
		}
		wb.close();
		fi.close();
		return filedata;
	}
//	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
//	{
//		fi=new FileInputStream(xlfile);
//		wb=new XSSFWorkbook(fi);
//		ws=wb.getSheet(xlsheet);
//		row=ws.getRow(rownum);
//		cell=row.createCell(colnum);
//		cell.setCellValue(data);
//		fo=new FileOutputStream(xlfile);
//		wb.write(fo);		
//		wb.close();
//		fi.close();
//		fo.close();
//	}
}
