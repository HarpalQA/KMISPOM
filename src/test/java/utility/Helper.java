package utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static String captureScreenshot(WebDriver driver, String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//String destination = "C:\\Users\\hsingh2\\workspace\\com.KMIS.POM\\Screenshots\\" + screenshotname
				String destination ="C:\\Users\\hsingh2\\workspace\\com.KMIS.POM1\\Screenshots\\"+ screenshotname
				+ System.currentTimeMillis() + " .png";
		try {
			FileUtils.copyFile(src, new File(destination));

		} catch (IOException e) {
			System.out.println("Failed to capture Screenshot" + e.getMessage());
		}
		return destination;
	}

	public static void scroll(WebDriver driver, int val) // To scroll the Page
															// horizontally
	{
		try {
			// ((JavascriptExecutor)driver).executeScript("scroll(0,1400)"); //
			// These values are horizontally and vertically

			((JavascriptExecutor) driver).executeScript("scroll(0," + val + ")"); // These
																					// values
																					// are
																					// horizontally
																					// and
																					// vertically

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
