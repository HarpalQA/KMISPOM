package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Configuration/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("The Exception is " + e.getMessage());
		}
	}

	public String getApplicationUrl() {
		String url = pro.getProperty("url");
		return url;
	}

	public String getChromePath() {
		String data = pro.getProperty("chromePath");
		return data;
	}

	public String getGeckoPath() {
		String data = pro.getProperty("GeckoPath");
		return data;
	}

}
