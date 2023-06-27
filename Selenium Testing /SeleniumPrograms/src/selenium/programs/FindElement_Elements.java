package selenium.programs;

import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Elements { 
       public static void main (String [] args){ 

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();	
   		
     driver.manage().window().maximize();
     driver.get("https://www.irctc.co.in/nget/user-registration");

     //Find the radio button for "Male" by using ID and click on it
     driver.findElement(By.id("M")).click();
     
     
     //----------------------List of elements---------------------//
     List<WebElement> elements = driver.findElements(By.id("M"));
     System.out.println("Number of elements:" +elements.size());

     for(int i=0; i<elements.size(); i++){
     System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	 }
   } 
}
