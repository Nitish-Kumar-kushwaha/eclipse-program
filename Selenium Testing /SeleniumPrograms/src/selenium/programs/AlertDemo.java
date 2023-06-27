package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
        // Alert Message handling                   		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
        Thread.sleep(5000);
        driver.findElement(By.name("cusid")).sendKeys("53920");			
        Thread.sleep(5000);
        driver.findElement(By.name("submit")).submit();			
        Thread.sleep(3000);
        
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        
        Thread.sleep(3000);
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	

}
