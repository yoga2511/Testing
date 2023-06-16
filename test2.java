package com.example.testing2;


import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.testing.App;

//import com.aventstack.extentreports.App;

public class test2 {
	
	test2 aa = new test2();
	  @List
	  public void Addition(int a,int b,int expected) {
		  int result = aa.CalculateAddition(a, b);
		  Assert.assertEquals(result, expected);
	  }
	  @DataProvider
	  public Object[][] expectedDataAddition()
	  {
		  return new Object[][]{
				  {1,2,3}
		  };
	  }
  
  
	  @Test(dataProvider="expectedDataSubtraction")
	  public void Subtraction(int a,int b,int expected) {
		  int result = aa.CalculateSubtraction(a, b);
		  Assert.assertEquals(result, expected);
	  	}
		  @DataProvider
		  public Object[][] expectedDataSubtraction()
		  {
			  return new Object[][]{
				  {5,2,3}
			  };
		  }
		  @Test(dataProvider="expectedDataMultiplication")
		  public void Multiplication(int a,int b,int expected) {
			  int result = aa.CalculateMultiplication(a, b);
			  Assert.assertEquals(result, expected);
		  }
		  @DataProvider
		  public Object[][] expectedDataMultiplication()
		  {
			  return new Object[][]{
				  {5,2,10}
			  };
		  }
		  @Test(dataProvider="expectedDataDivision")
		  public void Division(int a,int b,int expected) {
			  int result = aa.CalculateDivision(a, b);
			  Assert.assertEquals(result, expected);
		  }
		  @DataProvider
		  public Object[][] expectedDataDivision()
		  {
			  return new Object[][]{
				  {4,2,2}
			  };
		  }
}

