package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import dataProvider.ConfigDataProvider;

public class BrowserFactory {
	static WebDriver driver;
	static ConfigDataProvider config;

	public static WebDriver getBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) { // config= new
														// ConfigDataProvider();
														// System.setProperty("webdriver.gecko.driver",
														// config.getGeckoPath());
			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfig().getGeckoPath());
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10
																			// seconds
																			// is
																			// standard
																			// practice
		return driver; // This return should be outside of all IF conditions but
						// with in the Method.
	}

	public static void closeBrowser(WebDriver ldriver) {
		ldriver.quit();
	}
}
