package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//div[2]/a/img")
	public WebElement KMISLogo;
	@FindBy(xpath = "//li[@id='menu-item-12']/a")
	public WebElement Productslink;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void clickonKMISlogo() {
		KMISLogo.click();
	}

	public void clickonProductlink() {
		Productslink.click();
	}

	public String getApplicationTitle() {
		return driver.getTitle();
	}

}
