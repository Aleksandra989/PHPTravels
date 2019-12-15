package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TravelsMenu extends BasicPage {
	
	private By dashboard = By.className("fa-desktop");
	private By updates = By.className("fa-refresh");
	private By modules = By.className("fa-cube");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By addNewInTours = By.cssSelector("#Tours > li:nth-child(2) > a");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By carsInCars = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By coupons = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[15]/a");
	private By newsletter = By.cssSelector("a[href='https://www.phptravels.net/admin/newsletter/']");
	private By bookings = By.cssSelector("a[href='https://www.phptravels.net/admin/bookings/']");
	
	public TravelsMenu(WebDriver driver) {
		super(driver);
	}
	public String getPageTitle() {
		return this.driver.getTitle();
	}
	public By getDashboard() {
		return dashboard;
	}
	public By getUpdates() {
		return updates;
	}
	public By getModules() {
		return modules;
	}
	public By getTours() {
		return tours;
	}
	public By getAddNewInTours() {
		return addNewInTours;
	}
	public By getCars() {
		return cars;
	}
	public By getCarsInCars() {
		return carsInCars;
	}
	
	public By getCoupons() {
		return coupons;
	}
	public By getNewsletter() {
		return newsletter;
	}
	public By getBookings() {
		return bookings;
	}
	public void goToDashboard() {
		this.driver.findElement(dashboard).click();
	}
	public void goToUpdates() {
		this.driver.findElement(updates).click();
	}
	public void goToModules() {
		this.driver.findElement(modules).click();
	}
	public void goToTours() {
		this.driver.findElement(tours).click();
	}
	public void addNewInTorus() {
		this.driver.findElement(tours).click();
		this.driver.findElement(addNewInTours).click();
	}
	public void goToCars() {
		this.driver.findElement(cars).click();
	}
	public void goToCarsInCars() {
		this.driver.findElement(cars).click();
		this.driver.findElement(carsInCars).click();
	}
	public void goToCoupons() {
		this.driver.findElement(coupons).click();
	}	
	public void goToNewsletter() {
		this.driver.findElement(newsletter).click();
	}
	public void goToBookings() {
		this.driver.findElement(bookings).click();
	}
}