package com.example.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4_3_2 {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	String url="https://demo.opencart.com";
    	//launching the url
    	driver.navigate().to(url);
    	driver.manage().window().maximize();
    	WebElement search = driver.findElement(By.name("search"));
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	js.executeScript("window.scrollBy(0,1500)", "") ;

    	search.sendKeys("mobiles");
    	Thread.sleep(5000);
    	js.executeScript("window.scrollBy(0,1500)", "") ;
    	WebElement returns = driver.findElement(By.linkText("Returns")) ;
    	returns.click();
    	driver.navigate().back();
    	Thread.sleep(5000);
    	js.executeScript("window.scrollBy(0,1500)", "") ;
    	WebElement gift = driver.findElement(By.partialLinkText("Gift Certificates"));
    	gift.click();
    	//driver.quit();
    	
    	}

}
