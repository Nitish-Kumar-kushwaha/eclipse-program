package selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\Selenium_Chrome_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); //----  pageLoadTimeout
		//driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);  //----  setScriptTimeout
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
	}
}
