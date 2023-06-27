package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SeleniumWebElement {
 
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	Thread.sleep(4000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(6000);
	driver.findElement(By.linkText("GPRS")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.partialLinkText("OPPO A31 (Lake Green, 4GB RAM, 64GB Storage)")).click();
	Thread.sleep(6000);
	driver.navigate().back();  // it will move back to the immedaite parent window
	
	Thread.sleep(6000);
	driver.navigate().to("https://login.yahoo.com");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#login-username")).sendKeys("abc@yahoo.com");	
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#login-signin")).click();
	
	Thread.sleep(2000);
	driver.quit();
	}
}