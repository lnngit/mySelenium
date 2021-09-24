package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("browse name is :" + browserName);
		System.out.println("Thread id is :"+Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Driver.CHROME, DriverLocation.CHROME);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(Driver.GECKO, DriverLocation.GECKO);
			driver = new FirefoxDriver();

		}

	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(Web.GOOGLE);
		Thread.sleep(4000);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test done sucessfully");
	}
}
