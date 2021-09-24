package testinig;

import org.openqa.selenium.chrome.ChromeDriver;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class Test {
	public static void main(String[] args) {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(Web.YOUTUBE);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
