package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hooks.BaseClass;

public class SalesHomePage extends BaseClass{

	public SalesHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public OpportunitiesHomePage selectOpportunities() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Opportunities']//span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).click().perform();
		
		return new OpportunitiesHomePage(driver);
	}
}
