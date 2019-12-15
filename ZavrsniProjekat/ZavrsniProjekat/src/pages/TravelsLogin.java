package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsLogin extends BasicPage {
	
	private By inputEmail = By.name("email");
	private By inputPassword = By.name("password");
	private By rememberMe = By.className("checkbox");
	private By forgetPassword = By.cssSelector("#link-forgot > strong");
	private By loginButton = By.cssSelector(".btn.btn-primary.btn-block");
	
	public TravelsLogin(WebDriver driver) {
		super(driver);
	}
	
	public WebElement setInputEmail() {
		return this.driver.findElement(inputEmail);

	}
	
	public WebElement setInputPassword() {
		return this.driver.findElement(inputPassword);
	}
	
	public WebElement getRememberMe() {
		return this.driver.findElement(rememberMe);
	}
	
	public WebElement getForgetPassword() {
		return this.driver.findElement(forgetPassword);
	}
	
	public WebElement loginButton() {
		return this.driver.findElement(loginButton);
	}
	
	public void LogIn (String inputEmail, String inputPassword) {
		this.setInputEmail().sendKeys(inputEmail);
		this.setInputPassword().sendKeys(inputPassword);
		this.getRememberMe().click();
		this.loginButton().click();
	}

	
}
