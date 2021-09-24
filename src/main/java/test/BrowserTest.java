package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Browser;
import constants.Driver;
import constants.DriverLocation;
import constants.Web;
import utils.MyProps;

public class BrowserTest {
	public static void main(String[] args) {
		MyProps props = MyProps.getInstance();
		String browser = props.read("browser");
		execute(browser);
		if(Browser.CHROME.equals(browser)) {
			props.write("browser", Browser.FIREFOX);
		}else {
			props.write("browser", Browser.CHROME);
		}
	}

	private static void execute(String browser) {
		setProperties();
		WebDriver driver = getDriver(browser);
		driver.get(Web.GOOGLE);
		System.out.println(driver.getTitle());
		System.out.println(driver);
		driver.quit();
	}

	private static void setProperties() {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		System.setProperty(Driver.GECKO, DriverLocation.GECKO);
	}

	private static WebDriver getDriver(String browser) {
		WebDriver driver;
		if (Browser.CHROME.equalsIgnoreCase(browser)) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
