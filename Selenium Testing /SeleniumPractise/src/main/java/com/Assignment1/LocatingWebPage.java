package com.Assignment1;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebPage  {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("Window opened.!!!!1");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Tv");
		System.out.println("Value enterd in text box....!");
		Thread.sleep(1000);
		
		WebElement searchButton = driver.findElement(By.className("nav-right"));
		searchButton.click();
		System.out.println("Button Clicked....!");
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
