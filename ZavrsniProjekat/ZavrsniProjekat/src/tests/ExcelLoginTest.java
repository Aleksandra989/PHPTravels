package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsLogin;

public class ExcelLoginTest extends BasicTest{

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test
	public void LoginExcell() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		TravelsLogin tl = new TravelsLogin(driver);

		tl.LogIn(Username, password);
		Thread.sleep(2000);
		wb.close();

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	}

}