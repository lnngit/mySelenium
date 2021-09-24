package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSeleniumTest {
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectLocation + "\\src\\main\\resources\\drivers\\" + "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://youtube.com/");
		driver.quit();
	}
}
