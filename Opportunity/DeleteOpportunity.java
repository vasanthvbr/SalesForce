package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteOpportunity {
public static void main(String[] args) throws InterruptedException {
ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--disable-notifications");
	
	ChromeDriver driver = new ChromeDriver(option);
	
	driver.get("https://login.salesforce.com/?locale=in");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	driver.findElement(By.id("username")).sendKeys(" hari.radhakrishnan@qeagle.com");
	
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	
	driver.findElement(By.id("Login")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	
	Thread.sleep(2000);

	WebElement ele = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));
	driver.executeScript("arguments[0].click();", ele);
	
	WebElement findElement = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
	findElement.sendKeys("Salesfource automated by Vasanth",Keys.ENTER);
	
	Thread.sleep(10000);
	findElement.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']")).click();
	
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[@name='Delete']/span")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
	
	WebElement findElement4 = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']//span"));
	System.out.println(findElement4.getText());
	
}
}
