package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import utility.Helper;

public class VerifyHomePage {
	WebDriver driver;
	HomePage home;
	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUP() {
		report = new ExtentReports("./Reports/HomePageReport.html", true);
		logger = report.startTest("Home Page");
		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		logger.log(LogStatus.INFO, "KMIS Home Page is Up and loading");
	}

	@Test(priority = 1)
	public void testHomePage() {
		home = PageFactory.initElements(driver, HomePage.class);
		String title = home.getApplicationTitle();
		Assert.assertTrue(title.contains("Insurance"));
		logger.log(LogStatus.PASS, "Home Page Title verified");
		System.out.println("Home Page Title is " + title);
		home.clickonProductlink();
		logger.log(LogStatus.PASS, "Products link is clicked");
	}

	@Test(priority = 2)
	public void ClickKMIS_IMG() {
		home.clickonKMISlogo();
		logger.log(LogStatus.INFO, logger.addScreenCapture(Helper.captureScreenshot(driver, "Screenshot1")));
	}

	@AfterMethod()
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String path = Helper.captureScreenshot(driver, result.getName());
			logger.log(LogStatus.PASS, logger.addScreenCapture(path));
		}
		report.endTest(logger);
		report.flush();
		// BrowserFactory.closeBrowser(driver);
	}
	@AfterClass()
	public void closebrowser()
	{
	// BrowserFactory.closeBrowser(driver);
	}

	// To add Screenshot after any line
	// logger.log(LogStatus.INFO,
	// logger.addScreenCapture(Helper.captureScreenshot(driver,
	// "Screenshot1")));

}
