package com.example.testing2;

import static org.testng.Assert.assertTrue;

import org.bouncycastle.util.test.Test;

public class day9_1 
extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public day9_1( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( day9_1.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
