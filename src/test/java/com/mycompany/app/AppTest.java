package com.mycompany.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    Student one = new Student(213225026);
    Student two = new Student(213225027);
    Student three = null;
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    //integer
    public void testStudentNumber(){
        Assert.assertEquals(213225026, one.studentNumber());
    }

    //float
    public void testStudentAmount(){
        Assert.assertEquals(10.00, one.studentAmount(), 0);

    }

    //the same object
    public void testSameObject(){
        Assert.assertSame(one, one);
    }

    //not the same object
    public void testNotSameObject(){
        Assert.assertNotSame(one, two);
    }

    //test if object is null
    public void testNull(){
        Assert.assertNull("the object is not null", three);    }

    //test if object is not null
    public void testNotNull(){
        Assert.assertNotNull("the object is null", one);
    }

    //test for true or false
    public void testTrue(){
        Assert.assertTrue("the function must return true", one.hasMatric('y'));
    }

    public void testFalse(){
        Assert.assertFalse("the function must return false", one.hasMatric('n'));
    }

    //test for exceptions
    public void testException(){
        Student shaun = new Student(213225028);
        shaun.studentMarksTotal(0, 0);
    }

}
