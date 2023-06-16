package com.example.testing2;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  @Test
	  public class CombinedCode {
		    @Test
		    public void executeTest() throws InterruptedException {
		        // Extent Reports code
		        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport2.html");
		        ExtentReports extent = new ExtentReports();
		        extent.attachReporter(spark);
		        ExtentTest test = extent.createTest("Facebook", "Login for Facebook");
		        
		        // Selenium WebDriver code
		        
		      	  WebDriverManager.chromedriver().setup();
		      	  WebDriver driver = new ChromeDriver();
		      	  driver.get("https://www.godaddy.com/");
		      	  driver.manage().window().maximize();
		      	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		      	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		      	  Thread.sleep(3000);
		      	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span")).click();
		      	  
			      extent.flush();
		    
		}

	  }
  }
}
