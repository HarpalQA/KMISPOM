package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import dataProvider.ExcelDataProvider;

public class ClaimsPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='menu-item-227']/a") public WebElement Claimslink;
	@FindBy(id = "PolicyText")
	public WebElement SearchPolicyPrefixbox;
	@FindBy(id = "ClaimModalBtn")
	public WebElement StartClaimbutton;
	@FindBy(id = "close")
	public WebElement ReportClaimClosebutton;
	@FindBy(id = "FileClaimAs")
	public WebElement FilingClaimasDDown;
	@FindBy(id = "PolicyNumber")
	public WebElement PolicyNumIbox;
	@FindBy(id = "Employer")
	public WebElement EmployerIbox;
	@FindBy(id = "FirstName")
	public WebElement FirstNameIbox;
	@FindBy(id = "LastName")
	public WebElement LastNameIbox;
	@FindBy(id = "Address")
	public WebElement AddressIbox;
	@FindBy(id = "ContactNumber")
	public WebElement ContactNumberIbox;
	@FindBy(id = "EmailAddress")
	public WebElement EmailAddIbox;
	@FindBy(xpath = "//*[@id='FileClaimAs']")
	public WebElement ClaimDDown1;
	@FindBy(xpath = "//*[@id='FileClaimAs']")
	public static WebElement ClaimDDown;
	@FindBy(id = "AccidentDate")
	public WebElement AccidentDate;
	@FindBy(xpath = "//*[@id='SubmitClaimForm']/div/div[17]/div/div/div/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[4]")
	public WebElement selectdate;
	@FindBy(xpath = "//*[@id='SubmitClaimForm']/div/table/tbody/tr[2]/td[3]")
	public WebElement selectdate1;
	@FindBy(id = "AccidentLocation")
	public WebElement LocationDDown;
	@FindBy(id = "AccidentAddress")
	public WebElement Address;
	@FindBy(id = "VehicleVin")
	public WebElement Vin;
	@FindBy(id = "VehicleYear")
	public WebElement VehicleYear;
	@FindBy(id = "VehicleMake")
	public WebElement VehicleMake;
	@FindBy(id = "VehicleModel")
	public WebElement VehicleModel;
	@FindBy(id = "VehicleAccidentDescription")
	public WebElement DescriptionAccident;
	@FindBy(xpath = "//*[@id='ClaimModal']//button[@class='close']")
	public WebElement CloseClaimbutton;

	public ClaimsPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void clickonClaims() {
		Claimslink.click();
	}

	public void clickonSearchPrefix() {
		SearchPolicyPrefixbox.click();
	}

	public void enterPrefix() {
		SearchPolicyPrefixbox.sendKeys("KB");
	}

	public void clickonStartClaimbutton() {
		StartClaimbutton.click();
	}

	public void clickddown() {
		boolean vis = FilingClaimasDDown.isDisplayed();
		System.out.println("Visible " + vis);
		FilingClaimasDDown.click();
	}

	public void clickonReportClaimClosebutton() {
		ReportClaimClosebutton.click();
	}

	public void line(String Filingas, String PolicyNum, String Employer) {
		FilingClaimasDDown.click();
		Select FilingClaimasDDown_s = new Select(FilingClaimasDDown);
		FilingClaimasDDown_s.selectByVisibleText(Filingas);
		FilingClaimasDDown.click(); // This additional click will close the drop
									// drop
		PolicyNumIbox.sendKeys(PolicyNum);
		EmployerIbox.sendKeys(Employer);
	}

	public void Personalinfo(String Fname, String Lname, String Address, String ContactNum, String EmailAdd) {
		FirstNameIbox.sendKeys(Fname);
		LastNameIbox.sendKeys(Lname);
		AddressIbox.sendKeys(Address);
		ContactNumberIbox.sendKeys(ContactNum);
		EmailAddIbox.sendKeys(EmailAdd);
	}

	public void Accidentdetails(String Location, String Addr) {
		LocationDDown.click();
		Select LocationDDown_s = new Select(LocationDDown);
		LocationDDown_s.selectByVisibleText(Location);
		LocationDDown.click(); // This additional click will close the drop drop
		Address.sendKeys(Addr);
	}

	public void AccidentdateValue() {
		boolean vis = AccidentDate.isDisplayed();
		System.out.println("Date is visivble " + vis);
		AccidentDate.click();
		AccidentDate.sendKeys("10/11/2017");
		AccidentDate.click();
		// selectdate.click();
		selectdate1.click();
		// seldate.sendKeys("10/11/2017");
	}

	public void Insuredvehicleinfo(String VIN, String Year, String Make, String Model, String DescriptionofAccident) {
		Vin.sendKeys(VIN);
		VehicleYear.sendKeys(Year);
		VehicleMake.sendKeys(Make);
		VehicleModel.sendKeys(Model);
		DescriptionAccident.sendKeys(DescriptionofAccident);
	}

	public void Closebuttonclaimform() {
		CloseClaimbutton.click();
	}

	// DataProvider for the Report Claim Form
	@DataProvider(name = "reportclaimData")
	public static Object[][] passData() {
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

	// DataProvider for the Personal Info Form
	@DataProvider(name = "PersonalinfoData")
	public static Object[][] personalinfoData() {
		ExcelDataProvider config = new ExcelDataProvider();
		int rows = config.getRowCount(1);
		System.out.println("The Number of row " + rows);
		Object[][] data = new Object[rows][5];
		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(1, i, 0);
			data[i][1] = config.getData(1, i, 1);
			data[i][2] = config.getData(1, i, 2);
			data[i][3] = config.getData(1, i, 3);
			data[i][4] = config.getData(1, i, 4);
			System.out.println(data);
		}
		return data;
	}

	// DataProvider for the Accidental details
	@DataProvider(name = "AccidentdetailsData")
	public static Object[][] AccidentdetailsData() {
		ExcelDataProvider config = new ExcelDataProvider();
		int rows = config.getRowCount(2);
		System.out.println("The Number of row " + rows);
		Object[][] data = new Object[rows][2];
		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(2, i, 0);
			data[i][1] = config.getData(2, i, 1);
			System.out.println(data);
		}
		return data;
	}

	// DataProvider for the Insured Vehicle
	@DataProvider(name = "InsuredVehicleinfoData")
	public static Object[][] InsuredVehicleinfoData() {
		ExcelDataProvider config = new ExcelDataProvider();
		int rows = config.getRowCount(3);
		System.out.println("The Number of row " + rows);
		Object[][] data = new Object[rows][5];
		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(3, i, 0);
			data[i][1] = config.getData(3, i, 1);
			data[i][2] = config.getData(3, i, 2);
			data[i][3] = config.getData(3, i, 3);
			data[i][4] = config.getData(3, i, 4);
			System.out.println(data);
		}
		return data;
	}

}
