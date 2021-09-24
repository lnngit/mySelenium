package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;
import constants.Browser;
import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class ChromeSeleniumTest {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		// setBrowser();
		PropertiesFile pf = new PropertiesFile();
		pf.readProperties();
		setBrowserConfig();
		runTest();
		pf.writeProperties();

	}

	public static void setBrowser() {
		browser = Browser.FIREFOX;

	}

	public static void setBrowserConfig() {

		if (browser.equals(Browser.FIREFOX)) {
			System.setProperty(Driver.GECKO, DriverLocation.GECKO);
			driver = new FirefoxDriver();
		}

		if (browser.equals(Browser.CHROME)) {
			System.setProperty(Driver.CHROME, DriverLocation.CHROME);
			driver = new ChromeDriver();
		}
	}

	public static void runTest() {
		driver.get(Web.YOUTUBE);
		driver.quit();
	}
}
