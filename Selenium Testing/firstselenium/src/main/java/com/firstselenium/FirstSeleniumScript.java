package com.firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

    public static void main(String[] args) throws InterruptedException {
        // Step 1: Load the Chrome driver
//        System.setProperty("webdriver.chrome.driver", "/");
        WebDriver driver = new ChromeDriver(); // This initializes the Chrome web browser

        // Step 2: Open the URL/website
        driver.get("https://www.gmail.com/");

        // Step 3: Maximize the window
        driver.manage().window().maximize();

        Thread.sleep(6000);

        // Step 4: Enter email address
        driver.findElement(By.id("identifierId")).sendKeys("nitishkumarkushwaha2509@gmail.com");

        Thread.sleep(4000);

        // Step 5: Click the Next button
        driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();

        Thread.sleep(3000);

        String at = driver.getTitle();
        System.out.println("Driver title: " + at);
        String st = "Gmail";

        // Step 6: Close the browser
        driver.quit();

        if (at.equalsIgnoreCase(st)) {
            System.out.println("Test successful");
        } else {
            System.out.println("Not successful");
        }
    }
}
