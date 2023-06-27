package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAssignment {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();	
		
        String baseUrl = "https://demo.automationtesting.in/Register.html";					
        driver.get(baseUrl);
        driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("window opened...");
		
		WebElement firstname =  driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]"));
		firstname.sendKeys("Nitish");
		
        WebElement lastName = driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]"));
        lastName.sendKeys("Kushwaha");
        System.out.println("names enterd");
        Thread.sleep(1000);
        
        WebElement address = driver.findElement(By.xpath("//*[@ng-model=\"Adress\"]"));
        address.sendKeys("IIM ROAD, LUCKNOW");
        System.out.println("Address entered");
        Thread.sleep(1000);
        
        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.sendKeys("nitish@gmail.com");
        System.out.println("Email eneterd..!!!");
        Thread.sleep(2000);
        
        WebElement phone = driver.findElement(By.xpath("//*[@ng-model=\"Phone\"]"));
        phone.sendKeys("8429128085");
        System.out.println("phone enterd....");
        Thread.sleep(1000);
        
        WebElement male = driver.findElement(By.xpath("//*[@value=\"Male\"]"));
        male.click();
        System.out.println("male clicke...");
        Thread.sleep(1000);
        
        WebElement cricket = driver.findElement(By.xpath("//*[@value=\"Cricket\"]"));
        cricket.click();
        
        WebElement movies = driver.findElement(By.xpath("//*[@value=\"Movies\"]"));
        movies.click();
        
        WebElement hockey = driver.findElement(By.xpath("//*[@value=\"Hockey\"]"));
        hockey.click();
        System.out.println("hobies selected.....!");
        Thread.sleep(1000);
        
        WebElement language = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        language.click();
      
        WebElement hindi= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a"));
        hindi.click();
//        Select drpCountry = new Select(language);
//		drpCountry.selectByVisibleText("Hindi");
//		drpCountry.selectByValue("Hindi");
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
		Thread.sleep(1000);
		
		WebElement skills = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		skills.click();
		WebElement java = driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]"));
		java.click();
		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
		System.out.println("skilss seleted...!");
		Thread.sleep(1000);
		
		WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]"));
		selectCountry.click();
		
		
		WebElement india = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]"));
		india.click();
		Thread.sleep(2000);
		
		//years
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[87]"));
		year.click();
		Thread.sleep(1000);
		System.out.println("year selected.!!!");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[10]"));
		month.click();
		Thread.sleep(1000);
		System.out.println("month selected.....");
		
		driver.findElement(By.xpath("//*[@id=\"daybox\"]")).click();
		WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[26]"));
		day.click();
		System.out.println("Day selected...!!!!");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		password.sendKeys("123456");
		System.out.println("Password enterd....!");
		Thread.sleep(2000);
		
		WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		confirmPassword.sendKeys("123456");
		System.out.println("Confirm password enterde.!!!!!");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
		Thread.sleep(10000);
		
		
		
        
		driver.close();
	}

}
