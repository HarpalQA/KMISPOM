package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
import pages.FooterPage;
import pages.HomePage;
import utility.Helper;

public class VerifyFooterPage {
	WebDriver driver;
	HomePage home;
	FooterPage footer;
	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUP() {
		report = new ExtentReports("./Reports/FooterPageReport.html", true);
		logger = report.startTest("Footer Page");
		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		footer = PageFactory.initElements(driver, FooterPage.class);
	}

	@Test(priority = 1, description = "This method will scroll down the page to the footer")
	public void Scrolltofooter() {
		home = PageFactory.initElements(driver, HomePage.class);
		Helper.scroll(driver, 3000);
	}

	@Test(priority = 2, description = "This method will click on Hankey Investment Company")
	public void ClickHankeyInvestment() {
		footer.clickonHankeyInvestmentLP();
		logger.log(LogStatus.INFO, "Hankey Investment Company, L.P. image is Clicked");
		logger.log(LogStatus.PASS, "Hankey Investment Company, L.P. image Clicked");
	}

	@Test(priority = 3, description = "This method will click on Hankey Capital")
	public void ClickHankeyCapital() {
		footer.clickonHankeyCapital();
		logger.log(LogStatus.INFO, "Hankey Capital image is Clicked");
		logger.log(LogStatus.PASS, "Hankey Capital image Clicked");
	}

	@Test(priority = 4, description = "This method will click on Westlake Financial Services")
	public void ClickWestlakeFinService() {
		footer.clickonWestlakeFinacialServices();
		logger.log(LogStatus.INFO, "Westlake Financial Services image is Clicked");
		logger.log(LogStatus.PASS, "Westlake Financial Services image Clicked");
	}

	@Test(priority = 5, description = "This method will click on Knight Insurance Group")
	public void ClickKnightInsuranceGroup() {
		footer.clickonKnightInsuranceGroup();
		logger.log(LogStatus.INFO, "Westlake Financial Services image is Clicked");
		logger.log(LogStatus.PASS, "Westlake Financial Services image Clicked");
	}

	@Test(priority = 6, description = "This method will click on Nowcom")
	public void ClickNowcom() {
		footer.clickonNowcom();
		logger.log(LogStatus.INFO, "Nowcom image is Clicked");
		logger.log(LogStatus.PASS, "Nowcom image Clicked");
	}

	@Test(priority = 7, description = "This method will click on North Hollywood Toyota")
	public void ClickNorthHollywoodToyota() {
		footer.clickonNorthHollyToyota();
		logger.log(LogStatus.INFO, "North Hollywood Toyota image is Clicked");
		logger.log(LogStatus.PASS, "North Hollywood Toyota image Clicked");
	}

	@Test(priority = 8, description = "This method will click on Miday Car")
	public void ClickMCar() {
		footer.clickonMidayCar();
		logger.log(LogStatus.INFO, "M Car - A Midway Company image is Clicked");
		logger.log(LogStatus.PASS, "M Car - A Midway Company image Clicked");
	}

	@Test(priority = 9, description = "This method will click on HFC Acceptance, LLC")
	public void ClickHFCLLC() {
		footer.clickonHFCAcceptance();
		logger.log(LogStatus.INFO, "HFC Acceptance, LLC image is Clicked");
		logger.log(LogStatus.PASS, "HFC Acceptance, LLC image Clicked");
	}

	@Test(priority = 10, description = "This method will click on Press Release")
	public void PressRelease() {
		footer.clickonPressRelease();
		logger.log(LogStatus.INFO, "Press Release Link is Clicked");
		logger.log(LogStatus.PASS, "Press Release Link Clicked");
	}

	@AfterMethod()
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String path = Helper.captureScreenshot(driver, result.getName());
			logger.log(LogStatus.PASS, logger.addScreenCapture(path));
		}
		report.endTest(logger);
		report.flush();
		
	}
	
	@AfterClass()
	public void closebrowser() 
	{
		
	// BrowserFactory.closeBrowser(driver);
	}

}
