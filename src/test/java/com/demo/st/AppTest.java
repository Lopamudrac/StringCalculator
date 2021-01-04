package com.demo.st;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.st.exception.STExceptions;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app= new  App();
    @Test
    public void testFindMax(){  
    	try {
			
			assertEquals(0,app.add(""));
			assertEquals(10,app.add("1,2,3,4"));
			assertEquals(0,app.add("1,2,cd,e"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
       
    }
}
