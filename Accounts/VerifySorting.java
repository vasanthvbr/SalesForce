package Accounts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifySorting {
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

	WebElement ele = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[9]"));
	driver.executeScript("arguments[0].click();", ele);
	
	WebElement findElement = driver.findElement(By.xpath("//span[@title='Account Owner Alias']"));
	driver.executeScript("arguments[0].click();", findElement);
	
	List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a"));
	System.out.println(findElements.size());
	for (int i = 1; i < findElements.size(); i++) {
		
		String text = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a)["+i+"]")).getText();
		System.out.println(text);
		
	}
	
}
}
