package pages;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import hooks.BaseClass;
import io.cucumber.java.it.Date;

public class OpportunitiesNewWindow extends BaseClass{

	public OpportunitiesNewWindow(ChromeDriver driver) {
		this.driver = driver;
	}
	
//	public OpportunitiesNewWindow opportunityName(String opportunityName) throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityName);
//		return this;
//	}
	
//	public OpportunitiesNewWindow stageSelection() throws InterruptedException {
//		WebElement temp = driver.findElement(By.xpath("(//button/span[contains(text(),'--None--')])[1]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(temp).click().perform();
//		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
//		return this;
//	}
	
	public void createNewOpportunityWindow() throws InterruptedException {
//		Thread.sleep(2000);
//		String mem = "Automation by Abhilesh Kumar";
//		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(mem);
		
		
//		WebElement ele = driver.findElement(By.xpath("//a[@title='Opportunities']//span"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(ele).click().perform();
		
		
//		WebElement temp = driver.findElement(By.xpath("(//button/span[contains(text(),'--None--')])[1]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(temp).click().perform();
//		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
//		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("4/13/2022");
//		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
//		Thread.sleep(5000);
//		WebElement oppbtn = driver.findElement(By.xpath("(//span[contains(text(),'Opportunities')])[2]"));
//		Actions oppBtnActions = new Actions(driver);
//		oppBtnActions.moveToElement(oppbtn).click().perform();
		WebElement store = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		store.sendKeys("Automation by Akshay Kumar");
		Thread.sleep(5000);
		WebElement scope = driver.findElement(By.xpath("//div[@class='slds-grid']"));
		Actions scopeActions = new Actions(driver);
		scopeActions.click().perform();
		Thread.sleep(10000);
		WebElement text = driver.findElement(By.xpath("//table/tbody/tr/td[8]/span/div/a"));
		text.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
//		WebElement text = driver.findElement(By.xpath("//table/tbody/tr[1]/th[1]"));
//		String name = text.getText();		
//		System.out.println(name);
//		if(name.equals(mem)) {
//			System.out.println("Text matched");
//		} else {
//			System.out.println("Text not matched");
//		}
		}

}
