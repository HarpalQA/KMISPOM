package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage {
	@FindBy(xpath = "//a[@href='http://www.hiclp.com/']/img")
	public WebElement HankeyInvestmentImg;
	@FindBy(xpath = "//a[@href='http://www.hankeycapital.com/']/img")
	public WebElement HankeyCapitalImg;
	@FindBy(xpath = "//a[@href='https://www.westlakefinancial.com/']/img")
	public WebElement WestlakefinserviceImg;
	@FindBy(xpath = "//a[@href='https://www.knightinsurancegroup.com/']/img")
	public WebElement KnighInsuranceGroupImg;
	@FindBy(xpath = "//a[@href='http://www.nowcom.com/']/img")
	public WebElement NowcomImg;
	@FindBy(xpath = "//a[@href='http://www.northhollywoodtoyota.com/']/img")
	public WebElement NHToyotaIMG;
	@FindBy(xpath = "//a[@href='http://www.midwaycarrental.com/Pages/default.aspx ']/img")
	public WebElement MCarIMG;
	@FindBy(xpath = "//a[@href='http://www.hfcacceptance.com/']/img")
	public WebElement HFCAccLLCIMG;
	@FindBy(xpath = "//a[contains (text(),'Press Release')]")
	public WebElement PressReleaselink;

	WebDriver driver;

	public FooterPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void clickonHankeyInvestmentLP() {
		HankeyInvestmentImg.click();
	}

	public void clickonHankeyCapital() {
		HankeyCapitalImg.click();
	}

	public void clickonWestlakeFinacialServices() {
		WestlakefinserviceImg.click();
	}

	public void clickonKnightInsuranceGroup() {
		KnighInsuranceGroupImg.click();
	}

	public void clickonNowcom() {
		NowcomImg.click();
	}

	public void clickonNorthHollyToyota() {
		NHToyotaIMG.click();
	}

	public void clickonMidayCar() {
		MCarIMG.click();
	}

	public void clickonHFCAcceptance() {
		HFCAccLLCIMG.click();
	}

	public void clickonPressRelease() {
		PressReleaselink.click();
	}
}
