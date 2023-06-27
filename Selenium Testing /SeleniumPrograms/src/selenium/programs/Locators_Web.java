package selenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Web {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		//--------------------By Id------------------------//
		driver.findElement(By.id("login-username")).sendKeys("viren@yahoo.com"); //id locator for text box
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#login-signin")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
	/*	//--------------------By Name---------------------//
		driver.findElement(By.name("username")).sendKeys("viren@yahoo.com");  // name locator for text box
		Thread.sleep(4000);
	*/	
		//--------------------Link Text-------------------//
		driver.findElement(By.linkText("Forgot username?")).click();
		Thread.sleep(4000);
		
	/*	//--------------------Partial Link Text-----------//
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(4000);
		
		//--------------------CSS Selector---------------//
		driver.findElement(By.cssSelector("#login-username")).sendKeys("viru@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#login-signin")).click();
		Thread.sleep(4000);
	*/	
		
		//----------------------ClassName-----------------//
		driver.get("https://www.python.org");
		driver.findElement(By.className("search-field")).sendKeys("lib");
		
		Thread.sleep(7000);
		driver.findElement(By.id("submit")).click();//id locator for next button
		driver.close(); 
		}
}
