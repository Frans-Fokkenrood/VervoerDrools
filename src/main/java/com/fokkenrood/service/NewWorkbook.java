package com.fokkenrood.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

public class NewWorkbook {

	public static void main(String[] args) {
		String filename		= "data\\ContraInformatie.xls";
		String tablename	= "TABBLAD";
		
		System.out.println("Start...");

		try {
			File file = new File(filename);
			if (file.exists()) {
				System.out.println("-The Excel Workbook '" + filename + "' already exists!");
				System.exit (99);
			}	// end if
			
			System.out.println("- Creating Excel Workbook '" + filename + "'.");
			FileOutputStream xlsFile = new FileOutputStream(file);
			HSSFWorkbook workbook = new HSSFWorkbook();
			
			System.out.println("- Creating the initial table '" + tablename + "' in the workbook.");
			HSSFSheet sheet = workbook.createSheet(tablename);

			System.out.println("- Creating the font for the header row.");
			HSSFFont font = workbook.createFont();
		    font.setFontHeightInPoints((short) 12);
		    font.setFontName("Arial");
		    font.setColor(IndexedColors.WHITE.getIndex());
		    font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			HSSFCellStyle headStyle = workbook.createCellStyle();
			headStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
			headStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			headStyle.setFont(font);
		
			System.out.println("- Creating the header row in the workbook.");
			Row row = sheet.createRow(0);
			
			sheet.setColumnWidth(0, 10000);
			Cell cell = row.createCell(0);
			cell.setCellValue("Sleutel");
			cell.setCellStyle(headStyle);
			
			sheet.setColumnWidth(1, 6000);
			cell = row.createCell(1);
			cell.setCellValue("Valid_begin");
			cell.setCellStyle(headStyle);
			
			sheet.setColumnWidth(2, 6000);
			cell = row.createCell(2);
			cell.setCellValue("Valid_end");
			cell.setCellStyle(headStyle);
			
			sheet.setColumnWidth(3, 10000);
			cell = row.createCell(3);
			cell.setCellValue("Waarde");
			cell.setCellStyle(headStyle);
						
		    workbook.write(xlsFile);		    
		    workbook.close();
		    xlsFile.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	
		System.out.println("Done!");
	}	// end main

}	// end class
