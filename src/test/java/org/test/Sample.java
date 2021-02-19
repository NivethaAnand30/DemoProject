package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Greens Tech\\Nive\\Maven7.30AM\\ExcelSheets\\ExcelData.xlsx");
		FileInputStream in = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Datas");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				String s1 = c.getStringCellValue();
				if (s1.equals("priya")) {
					FileOutputStream out = new FileOutputStream(loc);
					c.setCellValue("Ria");
					w.write(out);
				}
			}
		}

	}
}
