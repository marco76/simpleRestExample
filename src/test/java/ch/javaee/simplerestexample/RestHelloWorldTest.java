/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.javaee.simplerestexample;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marco
 */
public class RestHelloWorldTest {
    
     String expectedResult = "Hello World";
      
    
    public RestHelloWorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hello method, of class RestHelloWorld.
     */
    @Test
    public void testHello() {
        System.out.println("hello");
        RestHelloWorld instance = new RestHelloWorld();
        String result = instance.hello();
        assertEquals(expectedResult, result);
       }
    
    
    
}
