package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantValues.ConstantValues;

public class ExcelsheetReadWrite {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow rownum;
	static XSSFCell cellObject;
	
	public static void excelpath(String excelpath) throws Exception
	{
		File f = new File(excelpath);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
    }
	
	public static String ReadExcelsheet(String sheetname,int row,int col)
	{
		sheet = wb.getSheet(sheetname);
		cellObject = sheet.getRow(row).getCell(col);
		if(cellObject.getCellType() == cellObject.CELL_TYPE_NUMERIC)
		{
			String intvalue = NumberToTextConverter.toText(cellObject.getNumericCellValue());
			return intvalue;
		}
		else
		{
			String cellvalue = cellObject.getStringCellValue();
			return cellvalue;
		}
		
	}
	public static void WriteExcelsheet(String sheetname,int row,int col,String testdata) throws Exception
	{
		sheet = wb.getSheet(sheetname);
		cellObject = sheet.getRow(row).getCell(col);
		cellObject.setCellValue(testdata);
		FileOutputStream fos = new FileOutputStream(new File(ConstantValues.excelpath));
		wb.write(fos);
		wb.close();
		excelpath(ConstantValues.excelpath);
		
	}

}
