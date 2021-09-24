package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class HeadlessChromeBrowser {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920,1080");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get(Web.GOOGLE);

		System.out.println(driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		System.out.println("compleate");
	}

}
