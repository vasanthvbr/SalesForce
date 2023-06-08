package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewOpportunity {
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

	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow'])[3]/input")).sendKeys("Salesfource automated by Vasanth");
	
	driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right'])/input")).sendKeys("06/05/2023");
	
	driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
	
	driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]/span")).click();
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@data-aura-class='forceActionLink'])[2]/div"));
	
	System.out.println(findElement.getText());
	

}
}
