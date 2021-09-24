package testinig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class FirefoxTest {
public static void main(String[] args) {
	System.setProperty(Driver.GECKO, DriverLocation.GECKO);
	WebDriver driver=new FirefoxDriver();
	driver.get(Web.GOOGLE);
	System.out.println(driver.getTitle());
	driver.quit();
}
}
