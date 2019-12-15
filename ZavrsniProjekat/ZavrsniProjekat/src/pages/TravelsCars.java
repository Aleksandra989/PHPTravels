package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {
	
	private By rowsOfOrders = By.cssSelector(".form-control.input-sm");
	private By rowsOfCars = By.cssSelector(".xcrud-list-container table.xcrud-list.table .xcrud-row");


	public TravelsCars(WebDriver driver) {
		super(driver);
	}
	
	
	public By getRowsOfOrders() {
		return rowsOfOrders;
	}


	public By getRowsOfCars() {
		return rowsOfCars;
		}
	
	public void clickOnCars() {
		this.getRowsOfCars();
	}
	
	public boolean is10() {
		boolean NumberOfCars10 = true;
		List<WebElement> carsList = driver.findElements(this.rowsOfCars);
		int counter = 0;
		for (int i = 0; i < carsList.size(); i++) {
			counter++;
		}
		System.out.println("Number of rented cars is: " + counter);

		if (counter != 10) {
			NumberOfCars10 = false;
		}
		return NumberOfCars10;

	}
	
	
	public boolean isMoreThen50() {
		boolean NmbrOfCars50 = false;
		int sum = 0;
		List<WebElement> listOfOrders = driver.findElements(this.rowsOfOrders);
		for (int i = 0; i < listOfOrders.size(); i++) {
			String str = listOfOrders.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sum = sum + number;
		}
		if (sum > 50) {
			NmbrOfCars50 = true;
		}
		return NmbrOfCars50;
	}
}
