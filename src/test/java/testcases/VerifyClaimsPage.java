package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataProvider.ExcelDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ClaimsPage;
import pages.HomePage;
import utility.Helper;

public class VerifyClaimsPage {
	WebDriver driver;
	HomePage home;
	ClaimsPage claims;
	ExtentReports report;
	ExtentTest logger;

	@BeforeTest
	public void setUP() {
	
		report = new ExtentReports("./Reports/ClaimsPageReport.html", true);
		logger = report.startTest("Claims Page");
		driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test(priority = 1, description = "This method will initiate the class Object for Home")
	public void ClickClaims() {
		home = PageFactory.initElements(driver, HomePage.class);
		claims = PageFactory.initElements(driver, ClaimsPage.class);
		claims.clickonClaims();
		logger.log(LogStatus.INFO, "Start a Claim button is Clicked");
		logger.log(LogStatus.PASS, "Start a Claim button Clicked");
	}

	@Test(priority = 2, description = "This method will Click Search Prefix and enter the Prefix ")
	public void SearchPolicyPrefix() {
		claims.clickonSearchPrefix();
		claims.enterPrefix();
		logger.log(LogStatus.INFO, "Prefix is typed in Input box");
		logger.log(LogStatus.PASS, "Prefix is typed in Input box");
	}

	@Test(priority = 3,description = "This method will Click on the Start a Claim button")
	public void ClickStartClaims() {
		Helper.scroll(driver, 1200);
		claims.clickonStartClaimbutton();
		logger.log(LogStatus.INFO, "Start a Claim button is Clicked");
		logger.log(LogStatus.PASS, "Start a Claim button Clicked");
	}

	// We dont this method clickdd we have done same thing in claimform method
	// by using dataprovider class
	/*
	 * @Test(priority = 4, dataProvider ="firstset") public void clickdd(String
	 * Filing_as, String PolicyNum, String Employer) {
	 * claims.ClaimDDown1.click(); claims.line(Filing_as,PolicyNum,Employer); }
	 */

	@Test(priority = 5, dataProviderClass = ClaimsPage.class, dataProvider = "reportclaimData", description = "This method will fill the First line of the form")
	public void claimform(String Filing_as, String PolicyNum, String Employer) {
		System.out.println(Filing_as + " " + PolicyNum + " " + Employer);
		claims.line(Filing_as, PolicyNum, Employer);
		logger.log(LogStatus.INFO, "First Line/First Row of form is filled");
		logger.log(LogStatus.PASS, "First Line/First Row of form filled");
	}

	@Test(priority = 6,dataProviderClass = ClaimsPage.class, dataProvider = "PersonalinfoData", description = "This method will fill the Personal Info")
	public void fillPersonalinfo(String Fn, String Ln, String Addrs, String ConNum, String Email) {
		System.out.println(Fn + " " + Ln + " " + Addrs + " " + ConNum + " " + Email);
		claims.Personalinfo(Fn, Ln, Addrs, ConNum, Email);
		logger.log(LogStatus.INFO, "Personal Info in form is filled");
		logger.log(LogStatus.PASS, "Personal Info in form filled");
	}

	@Test(priority = 7,enabled = false,description = "This method will work with the Calendar")
	public void Accidate() {
		System.out.println("We are in calendar");
		claims.AccidentdateValue();
		logger.log(LogStatus.INFO, "Accident date in form is filled");
		logger.log(LogStatus.PASS, "Accident date in form filled");
	}

	@Test(priority = 7,dataProviderClass = ClaimsPage.class, dataProvider = "AccidentdetailsData", description = "This method will fill the Accidental details")
	public void fillAccidentinfo(String Loc, String Addrss) {
		claims.Accidentdetails(Loc, Addrss);
		logger.log(LogStatus.INFO, "Accident location & Address in form is filled");
		logger.log(LogStatus.PASS, "Accident location & Address in form filled");
	}

	@Test(priority = 8,dataProviderClass = ClaimsPage.class, dataProvider = "InsuredVehicleinfoData", description = "This method will fill Insure Vehicle details")
	public void fillInsuredvehicleinfo(String Vvin, String VYear, String VMake, String VMod, String VDesc) {
		claims.Insuredvehicleinfo(Vvin, VYear, VMake, VMod, VDesc);
		logger.log(LogStatus.INFO, "Insured Vehicle Info in form is filled");
		logger.log(LogStatus.PASS, "Insured Vehicle Info in form filled");
	}

	@Test(priority = 9)
	public void clickCloseclaimreport() {
		// claims.Closebuttonclaimform();
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
	@DataProvider(name = "firstset")
	public Object[][] passData() {
		ExcelDataProvider config = new ExcelDataProvider();
		int rows = config.getRowCount(0);
		System.out.println("The Number of row " + rows);
		Object[][] data = new Object[rows][3];
		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
			data[i][2] = config.getData(0, i, 2);

			System.out.println(data);
		}
		return data;
	}

}
