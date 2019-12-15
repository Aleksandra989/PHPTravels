package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsCars;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class CarsTest extends BasicTest{

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
	public void TravelsCarsTest() throws InterruptedException {

		
		TravelsMenu tm= new TravelsMenu(driver);
		tm.goToCars();
		tm.goToCarsInCars();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));
	}

	@Test(priority = 10)
	public void CarsName() throws InterruptedException {

		TravelsCars tcp = new TravelsCars(driver);
		
		Assert.assertFalse(tcp.is10());
		
		Assert.assertTrue(tcp.isMoreThen50());
		
		
		

	}

}
