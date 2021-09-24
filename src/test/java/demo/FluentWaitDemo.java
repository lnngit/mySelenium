package demo;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import constants.Driver;
import constants.DriverLocation;
import constants.Web;

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static void test() throws InterruptedException {
		System.setProperty(Driver.CHROME, DriverLocation.CHROME);
		WebDriver driver = new ChromeDriver();
		driver.get(Web.GOOGLE);
		driver.findElement(By.name("q")).sendKeys("adele hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		// driver.findElement(By.linkText("ABCD Alphabet Song for Kids | Baby Nursery
		// Rhymes")).click();
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.of(30L, ChronoUnit.SECONDS))
				.pollingEvery(Duration.of(2L, ChronoUnit.SECONDS)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkEliment = driver.findElement(By.linkText("Adele - Hello - YouTube"));

				if (linkEliment.isEnabled()) {
					System.out.println("element found");
				}

				return linkEliment;

			}
		});
		element.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
