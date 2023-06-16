package com.example.testing2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class day11_1 {
	 @Test
	  public class CombinedCode {
		    @Test
		    public void executeTest() {
		        // Extent Reports code
		        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport1.html");
		        ExtentReports extent = new ExtentReports();
		        extent.attachReporter(spark);
		        ExtentTest test = extent.createTest("Facebook", "Login for Facebook");
		        
		        // Selenium WebDriver code
		        WebDriverManager.edgedriver().setup();
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.godaddy.com/");
		        String title = driver.getTitle();
		        AssertJUnit.assertEquals(title, driver.getTitle());
		        System.out.println(title);
		        // Logging test status to Extent Reports
		        if (title.equals(driver.getTitle())) {
		            test.log(Status.PASS, "Test Passed");
		        } else {
		            test.log(Status.FAIL, "Test Failed");
		        }

		        // Closing browser and generating Extent Reports
		        driver.quit();
		        extent.flush();
		    }
		}

}
