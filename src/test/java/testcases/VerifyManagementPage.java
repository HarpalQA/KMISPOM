package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.ManagementPage;
import utility.Helper;

public class VerifyManagementPage {
	WebDriver driver;
	HomePage home;
	ManagementPage management;
	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUP() {
		report = new ExtentReports("./Reports/ManagementPageReport.html", true);
		logger = report.startTest("Management Page");
		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test(priority = 1)
	public void ClickManagementlink() {
		home = PageFactory.initElements(driver, HomePage.class);
		management = PageFactory.initElements(driver, ManagementPage.class);
		management.clickonManagement();
		String title = home.getApplicationTitle();
		Assert.assertTrue(title.contains("Insurance"));
		System.out.println("The Management Page title is " + title);
	}

	@Test(priority = 2, description = "This Test case will click on the Don Hankey Image")
	public void ClickDonHankeyimg() {
		management.clickonDHimg();
		String title = home.getApplicationTitle();
		System.out.println("The DH Page title is" + title);
		Assert.assertTrue(title.contains("Don"));
		logger.log(LogStatus.INFO, "Don Hankey image is Clicked");
		logger.log(LogStatus.PASS, "Don Hankey image Clicked");
	}

	@Test(priority = 3, description = "This Test case will click on the Amit Shah Image")
	public void ClickAmitShahimg() throws Exception {
		management.clickonASimg();
		String title = home.getApplicationTitle();
		System.out.println("The AS Page title is" + title);
		Assert.assertTrue(title.contains("Amit"));
		logger.log(LogStatus.INFO, "Amit Shah image is Clicked");
		logger.log(LogStatus.PASS, "Amit Shah image Clicked");
	}

	@Test(priority = 4, description = "This Test case will click on the David Keum Image")
	public void ClickDavidKeum() {
		management.clickonDKimg();
		String title = home.getApplicationTitle();
		System.out.println("The DK Page title is" + title);
		Assert.assertTrue(title.contains("David"));
		logger.log(LogStatus.INFO, "David Keum image is Clicked");
		logger.log(LogStatus.PASS, "David Keum image Clicked");
	}

	@Test(priority = 5, description = "This Test case will click on the John Rygn Image")
	public void ClickJohnRygh() {
		management.clickonJRimg();
		String title = home.getApplicationTitle();
		System.out.println("The JR Page title is" + title);
		Assert.assertTrue(title.contains("John"));
		logger.log(LogStatus.INFO, "John Rygh image is Clicked");
		logger.log(LogStatus.PASS, "John Rygh image Clicked");
	}

	@Test(priority = 6, description = "This Test case will click on the Alexandra Belaya Image")
	public void ClickAlexandraBelaya() {
		management.clickonABimg();
		String title = home.getApplicationTitle();
		System.out.println("The AB Page title is" + title);
		Assert.assertTrue(title.contains("Alexandra"));
		logger.log(LogStatus.INFO, "Alexandra Belaya image is Clicked");
		logger.log(LogStatus.PASS, "Alexandra Belaya image Clicked");
	}

	@Test(priority = 7, description = "This Test case will click on the Vance Ownber Image")
	public void ClickVanceOwnber() {
		management.clickonVOimg();
		String title = home.getApplicationTitle();
		System.out.println("The AB Page title is" + title);
		Assert.assertTrue(title.contains("Vance"));
		logger.log(LogStatus.INFO, "Vance Ownber image is Clicked");
		logger.log(LogStatus.PASS, "Vance Ownber image Clicked");
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

}
