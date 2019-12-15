package tests;



import java.io.IOException;

import org.testng.annotations.Test;

import pages.TravelsLogin;



public class LoginTest extends BasicTest {
	

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test(priority = 0)
	public void basicLogin() throws InterruptedException, IOException {
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);
		tl.LogIn("admin@phptravels.com", "demoadmin");
	}
}