package Accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {
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
	
	driver.findElement(By.xpath("//div[text()='New']")).click();
	
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Vasanth");
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
	
	driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']//span"));
	System.out.println(findElement.getText());
	
}
}
