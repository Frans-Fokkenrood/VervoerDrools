package com.fokkenrood.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExtraheerBlazeSRL {
	public static void main(String[] args) {
		System.out.println("- Start extractie...");
		try {
			FileInputStream xlsFile = new FileInputStream(new File("data\\contentDICvv0.xls"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("data\\contentDIC.txt")));
			HSSFWorkbook workbook = new HSSFWorkbook(xlsFile);
			HSSFSheet sheet = workbook.getSheet("DICvv0");

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				HSSFRow	row = sheet.getRow(i);
				
				String regelset = row.getCell(0).getStringCellValue();
				regelset = regelset.substring(6, regelset.indexOf("_"));

				String regel = row.getCell(1).getStringCellValue();
				
				String srl = row.getCell(2).getStringCellValue();
				srl = srl.replaceAll("<body>", "");
				srl = srl.replaceAll("<!\\[CDATA\\[", "").replaceAll("\\]\\]>", "");
				srl = srl.replaceAll("</body>", "");
				
				writer.write("@Regel \"" + regel + "\" in \"" + regelset + "\":\n/*\n" + srl + "\n*/\n\n");
				writer.write("@Testcase \"" + regel + "_TC\" in \"" + regelset + "\":\n/*\n*/\n\n\n");
			} // end for

			workbook.close();
			writer.close();
			xlsFile.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("- Done!");
	} // end main

} // end claass
