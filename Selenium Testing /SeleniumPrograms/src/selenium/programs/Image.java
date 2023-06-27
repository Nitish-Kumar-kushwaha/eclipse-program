package selenium.programs;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;  

public class Image{    

    public static void main(String[] args) throws InterruptedException {         
        String Url = "https://www.edureka.co/devops-certification-courses";    
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();  

        driver.get(Url);    
        //click on the "Edureka" logo on the upper left portion 
        driver.findElement(By.xpath("//i[@class='icon-logo edu-logo-style']")).click();    
        Thread.sleep(3000);
        
        //verify that we are now back on Edureka's homepage 
        if (driver.getTitle().equals("Instructor-Led Online Training with 24X7 Lifetime Support | Edureka")) {      
            System.out.println("We are at Edureka's homepage");    
        } else {  
            System.out.println("We are NOT on Edureka's homepage");    
        } 
    driver.close();  

    } 
}