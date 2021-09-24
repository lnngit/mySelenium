package demo;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public  class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniumWaits();
	}

	public static  void seleniumWaits() {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(Web.GOOGLE);
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
		
	}
}
