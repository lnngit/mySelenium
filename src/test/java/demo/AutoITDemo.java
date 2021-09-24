package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Driver;
import constants.DriverLocation;

public class AutoITDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	public static void test() throws IOException, InterruptedException {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		WebDriver driver=new ChromeDriver();
		driver.get("https://filetransfer.io/");
		
		driver.findElement(By.className("icon-upload")).click();
		Runtime.getRuntime().exec("C:/Users/srava/OneDrive/Documents/FileUploadScript.exe");
		Thread.sleep(3000);
		}

}
