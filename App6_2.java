package com.example.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App6_2 {
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	    driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Yoga");
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("yoga2003@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("lenovo");
	    driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("R");
	  WebElement datepicker= driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
	}

}
