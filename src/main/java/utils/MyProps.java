package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import constants.Location;

public class MyProps {
	private Properties properties;

	private MyProps() {
		properties = new Properties();
		init();
	}

	public void init() {
		try (InputStream is = new FileInputStream(Location.PROPS)) {
			properties.load(is);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String read(String key) {
		return (String) properties.get(key);
	}

	public void write(String key, String value) {
		try (OutputStream os = new FileOutputStream(Location.PROPS)) {
			properties.setProperty(key, value);
			properties.store(os, "Storing new/updated values");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static class MyPropsHolder {
		private static final MyProps INSTANCE = new MyProps();
	}

	public static MyProps getInstance() {
		return MyPropsHolder.INSTANCE;
	}
}
