package com.example.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3_2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        
		driver.manage().window().maximize();
        
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("mobiles");
       
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)", "");
        Thread.sleep(3000);
        
        WebElement returns = driver.findElement(By.linkText("Returns"));
        returns.click();
        driver.navigate().back();
        
        WebElement giftcertificates = driver.findElement(By.linkText("Gift Certificates"));
        giftcertificates.click();
         
        Thread.sleep(3000);

        //driver.quit();
	}

}
