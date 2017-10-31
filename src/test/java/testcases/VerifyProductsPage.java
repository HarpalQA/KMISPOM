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
import pages.ProductsPage;
import utility.Helper;

public class VerifyProductsPage {
	WebDriver driver;
	ProductsPage products;
	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUP() {
		report = new ExtentReports("./Reports/ProductsPageReport.html", true);
		logger = report.startTest("Products Page");
		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		logger.log(LogStatus.INFO, "Products Page is Up and loading");
	}

	@Test(priority = 1)
	public void ClickProductslink() {
		int c = 1;
		System.out.println("count"+c);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		String title = home.getApplicationTitle();
		Assert.assertTrue(title.contains("Insurance"));
		home.clickonProductlink();
		logger.log(LogStatus.INFO, "Products link is Clicked");
		logger.log(LogStatus.PASS, "Products link Clicked");
		products = PageFactory.initElements(driver, ProductsPage.class);
		// products.clickonCommercialAutomotive();
		c++;
		System.out.println(c);
	}

	@Test(priority = 2)
	public void ClickCommercialAutomotivelink() {
		products.clickonCommercialAutomotive();
		logger.log(LogStatus.INFO, "Commercial Automotive link is Clicked");
		logger.log(LogStatus.PASS, "Commercial Automotive link Clicked");

	}

	@Test(priority = 3)
	public void ClickTruckingTransportation() {
		products.clickonTruckingTransportation();
		logger.log(LogStatus.INFO, "Trucking & Transportation link is Clicked");
		logger.log(LogStatus.PASS, "Trucking & Transportation link Clicked");
	}

	@Test(priority = 4)
	public void ClickAutomotiveDealership() {
		products.clickonAutomotiveDealership();
		logger.log(LogStatus.INFO, "Automotive Dealership link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Dealership link Clicked");
	}

	@Test(priority = 5)
	public void ClickGuranteedAssetProtection() {
		products.clickonGuranteedAssetProtection();
		logger.log(LogStatus.INFO, "Guranteed Asset Protection link is Clicked");
		logger.log(LogStatus.PASS, "Guranteed Asset Protection link Clicked");
	}

	@Test(priority = 6)
	public void ClickNonFranAutoDealerships() {
		products.clickonNonFranAutoDealerships();
		logger.log(LogStatus.INFO, "Non-Franchised Auto Dealerships link is Clicked");
		logger.log(LogStatus.PASS, "Non-Franchised Auto Dealerships link Clicked");
	}

	@Test(priority = 7)
	public void ClickAutomotiveRental() {
		products.clickonAutomotiveRental();
		logger.log(LogStatus.INFO, "Automotive Rental link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Rental link Clicked");
	}

	@Test(priority = 8)
	public void ClickFleetLiability() {
		products.clickonFleetLiability();
		logger.log(LogStatus.INFO, "Automotive Rental link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Rental link Clicked");
	}

	@Test(priority = 9)
	public void ClickPersonalAccidentProtection() {
		products.clickonPersonalAccidentProtection();
		logger.log(LogStatus.INFO, "Automotive Rental link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Rental link Clicked");
	}

	@Test(priority = 10)
	public void ClickPersonalEffectsCoverage() {
		products.clickonPersonalEffectsCoverage();
		logger.log(LogStatus.INFO, "Automotive Rental link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Rental link Clicked");
	}

	@Test(priority = 11)
	public void ClickRenterLiabilityProtection() {
		products.clickonRenterLiabilityProtection();
		logger.log(LogStatus.INFO, "Automotive Rental link is Clicked");
		logger.log(LogStatus.PASS, "Automotive Rental link Clicked");
	}

	@Test(priority = 12)
	public void ClickSupplementalLiabilityInsurance() {
		products.clickonSupplementalLiabilityInsurance();
		logger.log(LogStatus.INFO, "Supplemental Liability Insurance link is Clicked");
		logger.log(LogStatus.PASS, "Supplemental Liability Insurance link Clicked");
	}

	@Test(priority = 13)
	public void ClickManagementLiabilityFinancial() {
		products.clickonManagementLiabFinan();
		logger.log(LogStatus.INFO, "Management Liability & Financial link is Clicked");
		logger.log(LogStatus.PASS, "Management Liability & Financial link Clicked");
	}

	@Test(priority = 14)
	public void ClickEquityProtectionlink() {
		products.clickonEquityProtectionlink();
		logger.log(LogStatus.INFO, "Equity Protection link is Clicked");
		logger.log(LogStatus.PASS, "Equity Protection link Clicked");
	}

	@Test(priority = 15)
	public void ClickMortalityProtection() {
		products.clickonMortalityProtection();
		logger.log(LogStatus.INFO, "Mortality Protection link is Clicked");
		logger.log(LogStatus.PASS, "Mortality Protection link Clicked");
	}

	@Test(priority = 16)
	public void ClickMortgageServiceProviderEO() {
		products.clickonMortServProviderEO();
		logger.log(LogStatus.INFO, "Mortgage Service Provider E&O link is Clicked");
		logger.log(LogStatus.PASS, "Mortgage Service Provider E&O link Clicked");
	}

	@Test(priority = 17)
	public void ClickSuretyBonds() {
		products.clickonSuretyBonds();
		logger.log(LogStatus.INFO, "Surety Bonds link is Clicked");
		logger.log(LogStatus.PASS, "Surety Bonds link Clicked");
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
	 //BrowserFactory.closeBrowser(driver);
	}

}
