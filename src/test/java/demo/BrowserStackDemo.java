package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackDemo {

	
		public static final String AUTOMATE_USERNAME = "leninkumarkoppoj_mbHU7W";
		  public static final String AUTOMATE_ACCESS_KEY = "1ztc7ApJiojXuxqqNqNj";
		  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  public static void main(String[] args) throws Exception {
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest-beta");
		    caps.setCapability("build", "Build1");
		    caps.setCapability("name", "Test1");
		    caps.setCapability("browserstack.local", "false");
		    caps.setCapability("browserstack.selenium_version", "3.14.0");
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		    driver.get("https://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("BrowserStack");
		    element.submit();
		    System.out.println(driver.getTitle());
		    driver.close();
		    driver.quit();

	
		  }
}
