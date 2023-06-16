package com.example.testing2;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.failsafe.internal.util.Assert;

public class day9_5 {
	 @Test
	  public void FirstMethod() {
		  Assert.assertEquals(true, false);
	  }
	  
	  @Test
	  public void SecondMethod() {
		  Assert.assertEquals(true, true);
	  }

}
