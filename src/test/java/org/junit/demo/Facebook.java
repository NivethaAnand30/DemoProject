package org.junit.demo;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	@Test
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}

	@Ignore
	@Test
	public void test4() {
		System.out.println("test4");
	}

}
