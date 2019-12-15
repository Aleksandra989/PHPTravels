package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.TravelsCarsExtras;
import pages.TravelsLogin;

public class ExtrasTest extends BasicTest {
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
	public void Extras() throws InterruptedException {
		driver.get ("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(2000);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);
		tce.clickExtrasAdd();
		Thread.sleep(1000);
		tce.setName("Opel Antara");
		Thread.sleep(1000);
		tce.setPrice("3000");
		tce.Status();
		Thread.sleep(2000);
		tce.clickOnUploadImage();
		Thread.sleep(4000);
		tce.Save();
		Thread.sleep(4000);		
		Assert.assertTrue(tce.getRow().getText().contains("Opel Antara"));
		Thread.sleep(2000);
		Assert.assertTrue(tce.getRow().getText().contains("3000"));
	}

}