package selenium.programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

public class AutoITFileUpload {				

	public static void main(String[] args) throws IOException, InterruptedException {								
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	driver.get("https://smallpdf.com/pdf-converter");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\test.exe");
	Thread.sleep(15000);
	System.out.println("Converted from doc to pdf");
	driver.close();	
     }
}
