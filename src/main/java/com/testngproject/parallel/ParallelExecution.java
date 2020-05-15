package com.testngproject.parallel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ParallelExecution {
    @Test    
    public void executSessionOne() throws InterruptedException{
            //First session of Webdrivers
    	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().deleteAllCookies();
		drivers.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
		drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait for 20 seconds
		drivers.get("https://www.google.com/intl/en-GB/gmail/about/#");
		Thread.sleep(2000);
		drivers.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();// click on sign in
		Set<String> windows = drivers.getWindowHandles();
		System.out.println("The number of windows are :"+windows.size());

		for (String win : windows) {
			System.out.println("The window handle is: " + win);
			drivers.switchTo().window(win);
		}
		
		System.out.println(drivers.getTitle());
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).click();
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).sendKeys("gmail.com");
		Thread.sleep(2000);
		Thread.sleep(2000);
		drivers.quit();

            
        }
        
    @Test    
        public void executeSessionTwo() throws InterruptedException{
            //Second session of Webdrivers
    	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().deleteAllCookies();
		drivers.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
		drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait for 20 seconds
		drivers.get("https://www.google.com/intl/en-GB/gmail/about/#");
		Thread.sleep(2000);
		drivers.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();// click on sign in
		Set<String> windows = drivers.getWindowHandles();
		System.out.println("The number of windows are :"+windows.size());

		for (String win : windows) {
			System.out.println("The window handle is: " + win);
			drivers.switchTo().window(win);
		}
		
		System.out.println(drivers.getTitle());
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).click();
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).sendKeys("gmail.com");
		Thread.sleep(2000);
		Thread.sleep(2000);
		drivers.quit();

        
        }
        
    @Test    
        public void executSessionThree() throws InterruptedException{
            //Third session of Webdrivers
    	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().deleteAllCookies();
		drivers.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
		drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait for 20 seconds
		drivers.get("https://www.google.com/intl/en-GB/gmail/about/#");
		Thread.sleep(2000);
		drivers.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();// click on sign in
		Set<String> windows = drivers.getWindowHandles();
		System.out.println("The number of windows are :"+windows.size());

		for (String win : windows) {
			System.out.println("The window handle is: " + win);
			drivers.switchTo().window(win);
		}
		
		System.out.println(drivers.getTitle());
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).click();
		Thread.sleep(2000);
		drivers.findElement(By.id("identifierId")).sendKeys("gmail.com");
		Thread.sleep(2000);
		Thread.sleep(2000);
		drivers.quit();

        
        }        
}
