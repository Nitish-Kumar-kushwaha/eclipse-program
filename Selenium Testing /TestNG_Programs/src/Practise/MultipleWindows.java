package Practise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleWindows {
	
//	WebDriver driver1;
	
	@Test(groups = "testone")
	public void testOne()throws InterruptedException{
		
		System.out.println("Starting Test On Chrome Browser");
		String baseUrl = "https://www.amazon.in/"; 
		System.out.println("Launching Google Chrome browser"); 
		
		System.setProperty("webdriver.chrome.driver", "/home/nitish/Desktop/ChromeDriver/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(baseUrl);
		driver1.manage().window().maximize();
		
		WebElement textbox =  driver1.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("mouse");
		Thread.sleep(2000);
		
		WebElement searchButton =  driver1.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement brand1 = driver1.findElement(By.xpath("//*[@id=\"p_89/ZEBRONICS\"]/span/a/div"));
		brand1.click();
		Thread.sleep(2000);
		
		driver1.findElement(By.partialLinkText("Zebronics Zeb-Power Wired USB Mouse, 3-Button, 1200 DPI Optical Sensor, Plug & Play, for Windows/Mac")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver1.getWindowHandles());
        driver1.switchTo().window(tabs.get(1));
		
        WebElement addTocart = driver1.findElement(By.id("add-to-cart-button"));
        addTocart.click();
        Thread.sleep(2000);
        
        driver1.close();
        driver1.switchTo().window(tabs.get(0));
        driver1.close();
        	
	}
	
	@Test(groups = "testtwo")
	public void testTwo()throws InterruptedException{
		
		System.out.println("Starting Test On Chrome Browser");
		String baseUrl = "https://www.amazon.in/"; 
		System.out.println("Launching Google Chrome browser"); 
		
		System.setProperty("webdriver.chrome.driver", "/home/nitish/Desktop/ChromeDriver/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(baseUrl);
		driver1.manage().window().maximize();
		
		WebElement textbox =  driver1.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("Led Monitor");
		Thread.sleep(2000);
		
		WebElement searchButton =  driver1.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement brand1 = driver1.findElement(By.xpath("//*[@id=\"p_89/ZEBRONICS\"]/span/a/div"));
		brand1.click();
		Thread.sleep(2000);
		
		driver1.findElement(By.partialLinkText("ZEBRONICS Zeb-V19Hd 18.5 Inch (46.99 Cm) Led Monitor with Supporting Hdmi, Vga Input, Hd 1366 X 768 Pixels, 16.7M Colors, Glossy Panel, Slim Design & Wall Mountable, Black")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver1.getWindowHandles());
        driver1.switchTo().window(tabs.get(1));
		
        WebElement addTocart = driver1.findElement(By.id("add-to-cart-button"));
        addTocart.click();
        Thread.sleep(2000);
        
        driver1.close();
        driver1.switchTo().window(tabs.get(0));
        driver1.close();
        	
	}
	
	@Test(groups = "testthree")
	public void testThree()throws InterruptedException{
		
		System.out.println("Starting Test On Chrome Browser");
		String baseUrl = "https://www.amazon.in/"; 
		System.out.println("Launching Google Chrome browser"); 
		
		System.setProperty("webdriver.chrome.driver", "/home/nitish/Desktop/ChromeDriver/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(baseUrl);
		driver1.manage().window().maximize();
		
		WebElement textbox =  driver1.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("headphone");
		Thread.sleep(2000);
		
		WebElement searchButton =  driver1.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement brand1 = driver1.findElement(By.xpath("//*[@id=\"p_89/boAt\"]/span/a/div"));
		brand1.click();
		Thread.sleep(2000);
		
		driver1.findElement(By.partialLinkText("boAt Rockerz 450 Bluetooth On Ear Headphones with Mic, Upto 15 Hours Playback, 40MM Drivers, Padded Ear Cushions, Integrated Controls and Dual Modes(Luscious Black)")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver1.getWindowHandles());
        driver1.switchTo().window(tabs.get(1));
		
        WebElement addTocart = driver1.findElement(By.id("add-to-cart-button"));
        addTocart.click();
        Thread.sleep(2000);
        
        driver1.close();
        driver1.switchTo().window(tabs.get(0));
        driver1.close();
        	
	}

}
