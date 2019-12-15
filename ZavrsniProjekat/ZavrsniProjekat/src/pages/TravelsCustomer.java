package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCustomer extends BasicPage {

	private By accounts = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By edit = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-list-container > table > tbody > tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.btn.btn-default.btn-xcrud.btn.btn-warning");
	private By firstName = By.name("fname");
	private By lastName = By.name("lname");
	private By email = By.name("email");
	private By password = By.name("password");
	private By mobileNumber = By.name("mobile");
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By country1 = By.className("select2-input");
	private By address1 = By.name("address1");
	private By address2 = By.name("address2");
	private By status = By.name("status");
	private By emailNewsletter = By.name("newssub");
	private By submit = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By search = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > a");
	private By insertName = By.name("phrase");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	
	
	public TravelsCustomer(WebDriver driver) {
		super(driver);
	}

	public void ClickOnAccounts() {
		this.driver.findElement(accounts).click();
	}

	public void ClickOnCustomer() {
		this.driver.findElement(customers).click();
	}

	public void ClickOnEdit() {
		this.driver.findElement(edit).click();
	}

	public void setFirstName(String firstName) {
		this.driver.findElement(this.firstName).clear();
		this.driver.findElement(this.firstName).sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.driver.findElement(this.lastName).clear();
		this.driver.findElement(this.lastName).sendKeys(lastName);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).clear();
		this.driver.findElement(this.email).sendKeys(email);
	}
	public void setInsertPassword(String password) {
		this.driver.findElement(this.password).clear();
		this.driver.findElement(this.password).sendKeys(password);
	}

	public void setMobileNumber(String mobileNumber) {
		this.driver.findElement(this.mobileNumber).clear();
		this.driver.findElement(this.mobileNumber).sendKeys(mobileNumber);

	}

	public void setAddress1(String address1) {
		this.driver.findElement(this.address1).sendKeys(address1);
	}
	public void setAddress2(String address2) {
		this.driver.findElement(this.address2).sendKeys(address2);
	}

	public void getStatus() {
		this.driver.findElement(status).click();
	}

	public void ClickOnEmailNews() {
		this.driver.findElement(emailNewsletter).click();
	}

	public void ClickOnSubmit() {
		this.driver.findElement(submit).click();
	}

	public void Status() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("Disabled");
	}

	public void getCountry() {
		this.driver.findElement(this.country).click();
		WebElement drzava = driver.findElement(this.country1);
		drzava.sendKeys("Australia");
		drzava.sendKeys(Keys.ENTER);
	}

	public void clickOnSearch() {
		this.driver.findElement(this.search).click();
	}

	public void setInsertName(String name) {
		this.driver.findElement(this.insertName).sendKeys(name);
	}

	public void ClickOnGo() {
		this.driver.findElement(this.go).click();
	}

	public WebElement getCustomer() {
		return this.driver.findElement(this.customers);
	}

}
