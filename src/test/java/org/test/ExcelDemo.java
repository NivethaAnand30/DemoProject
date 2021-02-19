package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utility.BaseClass;

public class ExcelDemo extends BaseClass{
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Greens Tech\\Nive\\Selenium7.30AM\\Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(readData(2, 0));
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(readData(2, 1));
	
	
	
}
}
