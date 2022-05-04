package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class OpportunitiesHomePage extends BaseClass {
	
	public OpportunitiesHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public OpportunitiesNewWindow clickNewButton() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@title='New']")).click();
		return new OpportunitiesNewWindow(driver);
	}
	
	
}
