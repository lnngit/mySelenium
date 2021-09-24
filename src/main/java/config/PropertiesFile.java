package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import constants.Location;
import test.ChromeSeleniumTest;

public class PropertiesFile {
	private static final String BROWSER = "browser";
	private static final String CONFIG_PROPERTIES = Location.PROJECT + "\\src\\main\\resources\\config.properties";
	Properties prop = new Properties();

	public static void main(String[] args) {
		PropertiesFile pf=new PropertiesFile(); 
		pf.writeProperties();
		pf.readProperties();
	}

	public void readProperties() {
		try {
			InputStream input = new FileInputStream(CONFIG_PROPERTIES);
			prop.load(input);
			// input.close();

			
			System.out.println(prop.getProperty(BROWSER));
			ChromeSeleniumTest.browser=prop.getProperty(BROWSER);
			System.out.println(ChromeSeleniumTest.browser);
			
			/*
			 * System.out.println(prop.getProperty("Result"));
			 * 
			 * for (Object key : prop.keySet()) { System.out.println(key + " = " +
			 * prop.get(key)); }
			 */
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeProperties() {
		try {
			OutputStream output = new FileOutputStream(CONFIG_PROPERTIES);
			prop.setProperty(BROWSER, "Chrome");
			prop.setProperty("Result", "pass");
			prop.store(output, "Storing the properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
