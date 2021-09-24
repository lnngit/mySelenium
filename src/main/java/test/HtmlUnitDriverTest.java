package test;

import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

import constants.Web;

public class HtmlUnitDriverTest {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
		driver.get(Web.GOOGLE);
		System.out.println("Title is " + driver.getTitle());

		WebClient webClient=(WebClient)get(driver,"webClient");

		//WebClient webClient = get(driver, "webClient", WebClient.class);

		System.out.println("browser version is " + webClient.getBrowserVersion());
		System.out.println("is browser version edge : " + webClient.getBrowserVersion().isEdge());
		System.out.println("is browser version Firefox : " + webClient.getBrowserVersion().isFirefox());
		driver.quit();
	}

	/*
	 * @SuppressWarnings("unchecked") private static <T> T get(Object object, String
	 * field, Class<T> className) throws Exception { return (T) get(object, field);
	 * }
	 */

	private static Object get(Object object, String field) throws Exception {
		Field f = object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}
}
