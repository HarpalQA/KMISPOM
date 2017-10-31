package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagementPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='menu-item-14']/a")
	public WebElement Managementlink;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/don-hankey']//img")
	public WebElement DHimg;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/amit-shah']//img")
	public WebElement ASimg;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/david-keum']//img")
	public WebElement DKimg;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/john-rygh']//img")
	public WebElement JRimg;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/alexandra-belaya']//img")
	public WebElement ABimg;
	@FindBy(xpath = "//div/a[@href='https://www.knightinsurancegroup.com/vance-ownbey']//img")
	public WebElement VOimg;
	By DHankey = By.xpath("//h3[text() ='Don Hankey']");
	By AShah = By.xpath("//h3[text() ='Amit Shah']");
	By DKeum = By.xpath("//h3[text() ='David Keum']");
	By JRygh = By.xpath("//h3[text() ='John Rygh']");
	By ABelaya = By.xpath("//h3[text() ='Alexandra Belaya']");
	By VOwnbey = By.xpath("//h3[text() ='Vance Ownbey']");

	public ManagementPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void clickonManagement() {
		Managementlink.click();
	}

	public void clickonDHimg() {
		DHimg.click();
		verifytext(DHankey);

	}

	public void verifyDHtext() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(DHankey));
		String text = ele.getText();
		System.out.println("The DH " + text);

	}

	public void verifytext(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele1 = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		String text1 = ele1.getText();
		System.out.println("The Name is " + text1);

	}

	public void clickonASimg() {
		ASimg.click();
		verifytext(AShah);
	}

	public void clickonDKimg() {
		DKimg.click();
		verifytext(DKeum);
	}

	public void clickonJRimg() {
		JRimg.click();
		verifytext(JRygh);
	}

	public void clickonABimg() {
		ABimg.click();
		verifytext(ABelaya);

	}

	public void clickonVOimg() {

		VOimg.click();
		verifytext(VOwnbey);
	}

}
