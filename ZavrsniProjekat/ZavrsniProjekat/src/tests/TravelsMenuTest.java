package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelsMenuTest extends BasicTest {
	private String baseURL = "https://www.phptravels.net/admin";

	@BeforeTest
	public void basicLogin() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);
		tl.LogIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void goToDashboard() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToDashboard();
		Assert.assertTrue(tm.getPageTitle().contains("Dashboard"));
		
	}
	
	@Test(priority = 10)
	public void goToUpdates() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToUpdates();
		Assert.assertTrue(tm.getPageTitle().contains("Updates"));
}
	@Test(priority = 15)
	public void goToModules() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToModules();
		Assert.assertTrue(tm.getPageTitle().contains("Modules"));
	
}
	@Test(priority = 20)
	public void goToTours() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToTours();
		Thread.sleep(1000);
		tm.addNewInTorus();
		Assert.assertTrue(tm.getPageTitle().contains("Add Tour"));
}
	@Test(priority = 25)
	public void goToCars() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToCars();
		Thread.sleep(1000);
		tm.goToCarsInCars();
		Assert.assertTrue(tm.getPageTitle().contains("Cars"));
	
}
	@Test(priority = 30)
	public void goToCoupons() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToCoupons();
		Assert.assertTrue(tm.getPageTitle().contains("Coupon"));
}
	@Test(priority = 35)
	public void goToNewsletter() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToNewsletter();
		Assert.assertTrue(tm.getPageTitle().contains("Newsletter"));
}
	@Test(priority = 40)
	public void goToBookings() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(1000);
		TravelsMenu tm = new TravelsMenu(driver);
		tm.goToBookings();
		Assert.assertTrue(tm.getPageTitle().contains("Booking"));
		
	}
}