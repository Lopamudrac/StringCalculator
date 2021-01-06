package com.demo.st;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.demo.st.exception.STExceptions;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app= new  App();
    
    @Test
    public void case0(){  
    	System.out.println("Initial test case started");
    	try {
			assertEquals(0,app.add(""));
			assertEquals(10,app.add("1,2,3,4")); //Case2
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
    	System.out.println("Initial test case completed");  
       
    }
    @Test
    public void case3(){  
    	try {
			
    		System.out.println("Test case3 started");
			assertEquals(3,app.add("1\n2")); //Case3
			//assertEquals(4,app.add("1,\n3")); //Case3 --check
			assertEquals(STExceptions.class,app.add("1,2,cd,e"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	System.out.println("Test case3 completed");
    }
    @Test
    public void case4(){  
    	try {
			
    		System.out.println("Test case4 started");
			assertEquals(3,app.add("//[**]\n1**2"));
			assertEquals(3,app.add("//**\n1**2"));
			assertEquals(15,app.add("//[&&&][;;;]\n1&&&5;;;9"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	System.out.println("Test case4 completed");
    }
    @Test
    public void case5(){  
    	System.out.println("Test case5 started");
    	try {
			
			//assertEquals(3,app.add("1\n2;-8")); //Case5
			assertEquals(STExceptions.class,app.add("1\n2,-8,-2")); //Case5
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	System.out.println("Test case5 completed");
    }
    @Test
    public void case6(){  
    	System.out.println("Test case6 started");
    	try {
			assertEquals(1002,app.add("1\n2,999,1000,1001")); //Case6
			assertEquals(3,app.add("1\n2,1001")); //Case6
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	System.out.println("Test case6 completed");
    }
}
