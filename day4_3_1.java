package com.example.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class day4_3_1 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );//
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Yoga"); 
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("R"); 
        
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec259@gmail.com"); 
        
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("yoga1234"); 
//        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
        
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        js.executeScript("window.scrollBy(0,3000)", "");
        
        
        
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();        
        
        driver.quit();
    }
    
}
