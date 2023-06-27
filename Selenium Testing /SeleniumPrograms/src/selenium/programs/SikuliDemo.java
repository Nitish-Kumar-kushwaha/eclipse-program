package selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SikuliDemo {

    public static void main(String[] args) throws InterruptedException //FindFailed 
    {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\Selenium_Chrome_Driver\\chromedriver.exe");
        
    	String filepath = "D:\\Selenium\\SikuliFiles\\";
        String inputFilePath = "D:\\Selenium\\SikuliFiles\\";
        
   /*     Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");  // File text field
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");        // Open button
        
        System.out.println("fileInputTextBox"+ fileInputTextBox);
        System.out.println("openButton"+ openButton);
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");
        Thread.sleep(3000);
        
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.id("photoimg"))).click().build().perform();
       
        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Test.docx");  
        s.click(openButton);
        

        // Close the browser
        //driver.close();
*/
    }

}
