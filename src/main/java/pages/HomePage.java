package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public HomePage clickAppLauncher() {
		driver.findElement(By.cssSelector(".slds-icon-waffle")).click();
		return this;
	}
	
	public SalesHomePage clickSalesOption() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(), 'Sales')])[3]")).click();
		return new SalesHomePage(driver);
	}
}	 
