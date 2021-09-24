package utils;

import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.WebClient;

public class MyUtils {
	public static WebClient getWebClient(WebDriver driver) {
		return (WebClient) get(driver, "webClient");
	}

	public static Object get(Object object, String fieldName) {
		try {
			Field field = object.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(object);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}
