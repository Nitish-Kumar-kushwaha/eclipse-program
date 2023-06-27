package com.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNesting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
        
        
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        
        
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]")).click();
        Thread.sleep(3000);
        System.out.println("clicked");
        int countIframesInPage = driver.findElements(By.xpath("//*[@id=\"Multiple\"]/iframe")).size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);
        Thread.sleep(5000);
        
        WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
        driver.switchTo().frame(frame1);
        System.out.println("switched to frame1");
        Thread.sleep(3000);
        
        WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(frame2);
        System.out.println("switched to frame2");
        Thread.sleep(3000);
        
        
        WebElement textBox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        textBox.sendKeys("nitish");
        Thread.sleep(2000);
        
        
        driver.close();
	}
}
