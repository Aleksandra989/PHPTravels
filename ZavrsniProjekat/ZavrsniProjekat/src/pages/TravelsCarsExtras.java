package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	private By extrasAdd = By.cssSelector(".btn.btn-success.xcrud-action");
	private By name = By.cssSelector("input.xcrud-input.form-control ");
	private By status = By.name("cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-"); 
	private By price = By.name("cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--");
	private By save = By.cssSelector("a.btn.btn-primary.xcrud-action");
	private By cars = By.cssSelector("tr.xcrud-row.xcrud-row-0");
	
	public TravelsCarsExtras(WebDriver driver) {
		super(driver);
	
    }
	
	public void clickExtrasAdd() {
		this.driver.findElement(extrasAdd).click();
	}
	
	 
	public void setName(String name) {
		this.driver.findElement(this.name).sendKeys(name);
	}
	public void setPrice(String price) {
		this.driver.findElement(this.price).sendKeys(price);
    }
	public void Save() {
		this.driver.findElement(save).click();
	}
	public void clickOnUploadImage() {
		WebElement uploadPicture = driver.findElement(By.name("xcrud-attach"));
		uploadPicture.sendKeys("C:/Users/Ilija/eclipse-workspace/ZavrsniProjekat/picture/picture.jpg");
	}
	
	public void Status() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("No");
	}
	public boolean carsExtrasAdded(String nameInput) {
		return this.driver.findElement(By.xpath("//td[contains(text(),'"+ nameInput +"')]")) != null;
	}
	public WebElement getRow() {
		return this.driver.findElement(this.cars);
	}
	
}