package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class MyTestNGListernsDemo {
	
	@Test
	public void test1() {
		System.out.println("i am in test1 ");
	}
	@Test
	public void test2() {
		System.out.println("i am in test2 ");
		//Assert.assertTrue(false);
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		WebDriver	driver = new ChromeDriver();
		driver.get(Web.GOOGLE);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		driver.quit();
	}
	@Test
	public void test3() {
		System.out.println("i am in test3 ");
		throw new SkipException("this test skipped");
	}

}
