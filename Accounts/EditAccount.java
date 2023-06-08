package Accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditAccount {
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
	
	WebElement findElement = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
	findElement.sendKeys("Vasanth",Keys.ENTER);
	Thread.sleep(10000);
	findElement.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a")).click();
	
	Thread.sleep(5000);
	
	WebElement findElement2 = driver.findElement(By.xpath("//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']"));
	driver.executeScript("arguments[0].click();", findElement2);

	driver.findElement(By.xpath("//a[@name='Edit']")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("1234567891");
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
	
	driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();
	
	Thread.sleep(5000);
	Actions action = new Actions(driver);
	
	WebElement scroll = driver.findElement(By.xpath("//label[text()='Billing Street']"));
	
	action.scrollToElement(scroll).perform();
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[4]")).click();
	
	Thread.sleep(5000);
	
	WebElement findElement3 = driver.findElement(By.xpath("//span[@class='slds-media__figure slds-listbox__option-icon']/following::span[text()='Healthcare']"));
	driver.executeScript("arguments[0].click();",findElement3);
	
	driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys("no:19,Banglore");
	
	driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("no:20,Chennai-600056");
	
	WebElement findElement4 = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[5]"));
	driver.executeScript("arguments[0].click();", findElement4);
	
	driver.findElement(By.xpath("//span[@title='Low']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]")).click();
	
	driver.findElement(By.xpath("//span[@title='Silver']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]")).click();
	
	driver.findElement(By.xpath("//span[@class='slds-media__figure slds-listbox__option-icon']/following::span[text()='No']")).click();
	
	driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]")).click();
	
	WebElement findElement5 = driver.findElement(By.xpath("(//span[@class='slds-media__body']/span)[3]"));
	driver.executeScript("arguments[0].click();", findElement5);
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	Thread.sleep(2000);
	WebElement print = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']//span"));
	System.out.println(print.getText());
	
}
}
