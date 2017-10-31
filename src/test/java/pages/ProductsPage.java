package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	WebDriver driver;
	@FindBy(xpath = "//div[@id ='productsTab']//nav//li[2]")
	public WebElement CommericalAutomotivelink;
	@FindBy(xpath = "//*[@id='productsTab']//div[2]//li[2]")
	public WebElement TruckingTransportationlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[3]//li[2]")
	public WebElement GuranteedAssetProtectionlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[3]//li[3]")
	public WebElement NonFranAutoDealershipslink;
	@FindBy(xpath = "//*[@id='productsTab']//div[4]//li[2]")
	public WebElement FleetLiablink;
	@FindBy(xpath = "//*[@id='productsTab']//div[4]//li[3]")
	public WebElement PersonalAccidentProtectionlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[4]//li[4]")
	public WebElement PersonalEffectsCovlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[4]//li[5]")
	public WebElement RenterLiabProtectionlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[4]//li[6]")
	public WebElement SuppLiabInsurancelink;
	@FindBy(xpath = "//div[@id ='productsTab']//nav//li[3]")
	public WebElement AutomotiveDealershiplink;
	@FindBy(xpath = "//div[@id ='productsTab']//nav//li[4]")
	public WebElement AutomotiveRentallink;
	@FindBy(xpath = "//div[@id ='productsTab']//nav//li[5]")
	public WebElement MgmtLiabFinlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[5]//li[2]")
	public WebElement EquProtectionlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[5]//li[3]")
	public WebElement MortProtectionlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[5]//li[4]")
	public WebElement MortServProviderEOlink;
	@FindBy(xpath = "//*[@id='productsTab']//div[5]//li[5]")
	public WebElement SuretyBondslink;

	public ProductsPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void clickonCommercialAutomotive() {// Click CommercialAutomotive -
												// 2nd Heading
		CommericalAutomotivelink.click();
	}

	public void clickonTruckingTransportation() {// Click TruckingTransportation
													// - Sub Heading
		TruckingTransportationlink.click();
	}

	public void clickonAutomotiveDealership() {// Click AutomotiveDealership -
												// 3rd Heading
		AutomotiveDealershiplink.click();
	}

	public void clickonGuranteedAssetProtection() { // Click
													// GuranteedAssetProtectionlink
													// - Sub Heading
		GuranteedAssetProtectionlink.click();
	}

	public void clickonNonFranAutoDealerships() {// Click NonFranAutoDealerships
													// - Sub Heading
		NonFranAutoDealershipslink.click();
	}

	public void clickonAutomotiveRental() {// Click AutomotiveRental - 4th
											// Heading
		AutomotiveRentallink.click();
	}

	public void clickonFleetLiability() {// Click FleetLiabiltiy - Sub Heading
		FleetLiablink.click();
	}

	public void clickonPersonalAccidentProtection() {// Click
														// PersonalAccidentProtection-
														// Sub Heading
		PersonalAccidentProtectionlink.click();
	}

	public void clickonPersonalEffectsCoverage() {// Click
													// PersonalEffectsCoverage-
													// Sub Heading
		PersonalEffectsCovlink.click();
	}

	public void clickonRenterLiabilityProtection() {// Click
													// RenterLiabilityProtection
													// - Sub Heading
		RenterLiabProtectionlink.click();
	}

	public void clickonSupplementalLiabilityInsurance() {// Click
															// SupplementalLiabilityInsurance
															// - Sub Heading
		SuppLiabInsurancelink.click();
	}

	public void clickonManagementLiabFinan() {// Click ManagementLiability &
												// Financial- 5th Heading
		MgmtLiabFinlink.click();
	}

	public void clickonEquityProtectionlink() {// Click Equity Protection - Sub
												// Heading
		EquProtectionlink.click();
	}

	public void clickonMortalityProtection() {// Click Mortality Protection -
												// Sub Heading
		MortProtectionlink.click();
	}

	public void clickonMortServProviderEO() { // Click Mortgage Service Provider
												// E&O- Sub Heading
		MortServProviderEOlink.click();
	}

	public void clickonSuretyBonds() {// Click Surety Bonds- Sub Heading
		SuretyBondslink.click();
	}

}
