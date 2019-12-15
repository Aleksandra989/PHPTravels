package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsCustomer;
import pages.TravelsLogin;

public class CustomerTest extends BasicTest{
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
	

	@Test
	public void SearchCustomer() throws InterruptedException {

		TravelsCustomer tp = new TravelsCustomer(driver);
		tp.ClickOnAccounts();
		Thread.sleep(1000);
		tp.ClickOnCustomer();
		Thread.sleep(500);
		tp.ClickOnEdit();
		Thread.sleep(500);
		tp.setFirstName("Marija");
		Thread.sleep(500);
		tp.setLastName("Markovic");
		Thread.sleep(500);
		tp.setEmail("marijamarkovic@gmail.com");
		Thread.sleep(500);
		tp.setMobileNumber("0641112221");
		Thread.sleep(500);
		tp.setAddress1("Pariske Komune 12");
		Thread.sleep(500);
		tp.getCountry();
		Thread.sleep(500);
		tp.Status();
		Thread.sleep(500);
		tp.ClickOnEmailNews();
		Thread.sleep(2000);
		tp.ClickOnSubmit();
		Thread.sleep(2000);
		tp.clickOnSearch();
		Thread.sleep(2000);
		tp.setInsertName("Marija");
		Thread.sleep(2000);
		tp.ClickOnGo();
		Assert.assertFalse(tp.getCustomer().getText().contains("Marija"));

	}
}