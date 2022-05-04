package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class Login extends BaseClass {
	
	public Login(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Login username(String userId) {
		driver.findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	
	public Login password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public HomePage loginButton() {
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);
	}
}
