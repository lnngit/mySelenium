package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import constants.Web;

public class SauseTestDemo {

	public static void main(String[] args) throws Exception {
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("username", System.getProperty("sauce.user.name"));
		sauceOptions.setCapability("access_key", System.getProperty("sauce.access.key"));
		sauceOptions.setCapability("name", "google test");
		// sauceOptions.setCapability("browserVersion", "latest");

		ChromeOptions options = new ChromeOptions();
		options.setCapability("platformName", "macOS 11.00");
		options.setCapability("browserVersion", "latest");
		options.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);

		driver.get(Web.GOOGLE);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		System.out.println("Tests completed");
	}

	public static void main2(String[] args) throws MalformedURLException {
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("name", "google test");
		sauceOptions.setCapability("browserVersion", "latest");

		ChromeOptions options = new ChromeOptions();
		options.setCapability("sauce:options", sauceOptions);
		URL url = new URL(System.getProperty("sauce.url"));
		RemoteWebDriver driver = new RemoteWebDriver(url, options);

		driver.get(Web.GOOGLE);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Tests completed");
	}

}
