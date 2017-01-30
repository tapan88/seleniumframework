package com.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datareading 
{
	
	public static String getconfigdata(String sfile,String skey) throws Throwable
	{
		
	
		String value=null;
		Properties prop=new Properties();
		try{
			FileInputStream fio=new FileInputStream(sfile);
	
		prop.load(fio);
		 value=prop.getProperty(skey);}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public  String getexceldata(String path,String sheetname,int rownum,int colnum) throws Exception
	{
		String value=null;
		try{
		FileInputStream fio=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fio);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		value=row.getCell(colnum).getStringCellValue();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public  void setexceldata(String path,String sheetname,int rownum,int colnum,String data) throws Exception
	{
		FileInputStream fio=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fio);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cell=row.createCell(colnum);
		cell.setCellType(cell.CELL_TYPE_STRING);
		FileOutputStream foo=new FileOutputStream(path);
		cell.setCellValue(data);
		wb.write(foo);
		
	}
	
	
	
	
	

}
