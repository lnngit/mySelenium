package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class PhantomjsTest {
	public static void main(String[] args) {
		System.setProperty(Driver.PHANTOM, DriverLocation.PHANTOM);
		WebDriver driver = new PhantomJSDriver();
		driver.get(Web.GOOGLE);
		System.out.println("title of web page is:"+driver.getTitle());
		driver.quit();
	}
}
