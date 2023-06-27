package com.SeleniumPractise;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://cosmocode.io/automation-practice-webtable");
		
		Thread.sleep(1000);
		
		List row = driver.findElements(By.xpath(".//*[@id=\"countries\"]/tbody/tr"));
		System.out.println("row size:" + row.size());
		
		List column = driver.findElements(By.xpath(".//*[@id=\"countries\"]/tbody/tr[1]/td"));
		System.out.println("column size: " + column.size());
		

		
		 WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		 Thread.sleep(5000);
		 
		 WebElement tableRow5 = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[5]"));
		 String rowtext5 = tableRow5.getText();
		 System.out.println("fiveth row  : " + rowtext5);
		 Thread.sleep(1000);
		 
		 WebElement tableRow8 = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[8]"));
		 String rowtext8 = tableRow8.getText();
		 System.out.println("eight row  : " + rowtext8);
		 Thread.sleep(1000);
		
		driver.close();
	}

}
