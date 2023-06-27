package selenium.programs;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class Form {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.id("email"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("keshav.aggarwal@gmail.com");		
        Thread.sleep(5000);
        password.sendKeys("abcdefghlkjl");		
        Thread.sleep(3000);
        System.out.println("Text Field Set");					
         
        // Deleting values in the text box		
        email.clear();		
        Thread.sleep(2000);
        password.clear();		
        Thread.sleep(2000);
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement login = driver.findElement(By.id("SubmitLogin"));							
                    		
        // Using click method to submit form
        Thread.sleep(3000);
        email.sendKeys("virendra.sharma@gmail.com");		
        Thread.sleep(3000);
        password.sendKeys("abcdefghlkjl");	
        Thread.sleep(3000);
        login.click();			
        System.out.println("Login Done with Click");					
        		
        //using submit method to submit the form. Submit used on password field		
        driver.get(baseUrl);					
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");				
        Thread.sleep(3000);
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");		
        Thread.sleep(3000);
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					
        Thread.sleep(5000); 
		driver.close();		
        		
    }		
}
