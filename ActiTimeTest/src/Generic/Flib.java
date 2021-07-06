package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//Generic reusable method for data from excel
	public String readExcel(String excelpath,String sheetname,int rowcount,int cellcount ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
		
	}
	//Generic reusable method for row count
	public int getRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
	  Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int row = sheet.getLastRowNum();
		return row;
	}
		//Generic reusable method for Write the data from excel
	public void writeExcel(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
	}
	//Generic reusable method for read prop file
	public String readPropertyFile(String proppath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(proppath);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		}


	}



