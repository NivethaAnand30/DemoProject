package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens Tech\\Nive\\Selenium7.30AM\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void insert(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static String readData(int row, int cell) throws IOException {
		String value=null;

		File loc = new File("C:\\Users\\Greens Tech\\Nive\\Maven7.30AM\\ExcelSheets\\ExcelData.xlsx");
		FileInputStream in = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Datas");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int type = c.getCellType();

		if (type == 1)

		{
			value = c.getStringCellValue();
		}

		else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
				value = f.format(d);

			} else {
				double n = c.getNumericCellValue();
				long l = (long) n;
				value = String.valueOf(l);
			}

		}
		return value;

	}

}
