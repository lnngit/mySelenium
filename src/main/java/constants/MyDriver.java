package constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public enum MyDriver {
	CHROME(Driver.CHROME, Location.DRIVER + "chromedriver.exe", Browser.CHROME),
	FIREFOX(Driver.GECKO, Location.DRIVER + "geckodriver.exe", Browser.FIREFOX),
	PHANTOM(Driver.PHANTOM, Location.DRIVER + "phantomjs.exe", Browser.PHANTOM);

	private String key;
	private String executor;
	private String name;
	

	private MyDriver(String key, String executor, String name) {
		this.key = key;
		this.executor = executor;
		this.name = name;
		//System.setProperty(key, executor);
	}

	public String getKey() {
		return key;
	}

	public String getExecutor() {
		return executor;
	}

	public String getName() {
		return name;
	}

	public WebDriver getDriverInstance() {
		return getDriver(name);
	}

	private WebDriver getDriver(String browser) {
		WebDriver driver;
			if (Browser.CHROME.equalsIgnoreCase(name)) {
				driver = new ChromeDriver();
			} else if (Browser.FIREFOX.equalsIgnoreCase(name)) {
				driver = new FirefoxDriver();
			} else {
				driver = new PhantomJSDriver();
			}
		return driver;
	}
}
