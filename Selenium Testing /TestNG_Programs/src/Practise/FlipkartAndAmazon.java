package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartAndAmazon  {
WebDriver driver , driver1 ;

	@Test(groups = "before")
	public void beforeMethod() throws InterruptedException {
		System.out.println("Starting Test On Chrome Browser");
		String baseUrl = "https://www.amazon.in/"; 
		String baseUrl1 = "https://www.flipkart.com/";
        System.out.println("Launching Google Chrome browser"); 
        
        //System Property for chrome Driver�� 
		System.setProperty("webdriver.chrome.driver", "/home/nitish/Desktop/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver1 = new ChromeDriver();
		
		driver.get(baseUrl);
		driver1.get(baseUrl1);
		driver.manage().window().maximize();
		driver1.manage().window().maximize();
		System.out.println("windows opened....!");
		Thread.sleep(4000);
	}
	
	@Test(groups = "search")
	public void search() throws InterruptedException {	  
	        
		WebElement textbox =  driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("watch");
		Thread.sleep(2000);
		
		WebElement searchButton =  driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(2000);
		
		//for flipkart
		
		WebElement searchBox = driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		searchBox.sendKeys("mobile");
//		WebElement searchButtonf = driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
//		searchButtonf.click();
		Thread.sleep(2000);
   }
	
	@Test( groups = "addTocart")
	public void cart() throws InterruptedException {	  
	        
		driver.findElement(By.partialLinkText("boAt Newly Launched Ultima Call")).click();
		Thread.sleep(2000);
		
		WebElement addtokart =  driver.findElement(By.xpath("//*[@name=\"submit.add-to-cart\"]"));
		addtokart.click();
		Thread.sleep(2000);
   }
	

	
	@Test(groups = "after")
	public void afterMethod() {		
		System.out.println("Finished Test On Chrome Browser");
		driver.close();
		driver1.close();
	}

}