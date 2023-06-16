package com.example.testing2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day9_6 {
	WebDriver driver;
	  @Test
	  public void OpenDriver() {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.get("");
		  
	  }


}
