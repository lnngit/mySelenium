package com.sravani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Location;
import constants.MyDriver;
import utils.ExcelUtils;

public class ExcelDataprovider {

	/*
	 * public static void main(String[] args) {
	 * 
	 * testData(Location.EXCEL, "sheet1"); }
	 */
	private WebDriver driver = null;

	@BeforeTest
	public void set() {
		MyDriver chrome = MyDriver.CHROME;
		System.setProperty(chrome.getKey(), chrome.getExecutor());
		driver = chrome.getDriverInstance();
	}
	
	public void set1() {
		String path = System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "test1data")
	public void test1(String username, String password) throws InterruptedException {
		System.out.println(username + " | " + password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(5000);
	}

	@DataProvider(name = "test1data")
	public Object[][] getdata() {
		return testData(Location.EXCEL, "sheet1");
	}

	private Object[][] testData(String excelpath, String sheetname) {

		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data[][] = new String[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellStringData = excel.getCellStringData(i, j);
				// System.out.print(cellStringData+"|");
				data[i - 1][j] = cellStringData;
			}
			System.out.println();
		}
		return data;
	}

}
