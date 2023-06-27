package selenium.programs;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table {
    public static void main(String[] args) throws ParseException, InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	  
		//---------------fetching total number of rows and columns for handling web table in Selenium------------//
		driver.get("http://demo.guru99.com/test/web-table-element.php");     
		Thread.sleep(5000);
		
        //No.of Columns
        @SuppressWarnings("rawtypes")
		List col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        Thread.sleep(5000);
        
        //No.of rows 
        @SuppressWarnings("rawtypes")
		List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        
        
        
        //----------------------------Dynamic Table-------------------------------//
        //----------Fetch cell value of a particular row and column--------------//
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		 Thread.sleep(5000);
		 
		 //to get 3rd row's 2nd column data
		 WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		 String valueIneed = cellIneed.getText();
		 System.out.println("Cell value is : " + valueIneed); 
        
        driver.close();
    }
}