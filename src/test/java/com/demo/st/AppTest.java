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
    	//System.out.println("Initial test case started");
    	try {
			assertEquals(0,app.add(""));
			assertEquals(3,app.add("1,2")); 
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
    	//System.out.println("Initial test case completed");  
       
    }
    @Test
    public void case2(){  
    	//System.out.println("Case 2 started");
    	try {
			
			assertEquals(10,app.add("1,2,3,4"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
    	//System.out.println("Case 2 completed");  
       
    }
    @Test
    public void case3(){  
    	try {
			
    		//System.out.println("Test case3 started");
			assertEquals(6,app.add("1\n2,3")); 
			assertEquals(1,app.add("1,\n")); 
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case3 completed");
    }
    @Test
    public void case4(){  
    	try {
			
    		//System.out.println("Test case4 started");
			assertEquals(3,app.add("//;\n1;2"));
			
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case4 completed");
    }
  
    @Test
    public void case5(){  
    	//System.out.println("Test case5 started");
    	try {
			
			//assertEquals(3,app.add("1\n2;-8")); 
			assertEquals(STExceptions.class,app.add("1\n2,-8,-2"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case5 completed");
    }
    @Test
    public void case6(){  
    	//System.out.println("Test case6 started");
    	try {
			assertEquals(1002,app.add("1\n2,999,1000,1001")); 
			assertEquals(3,app.add("1\n2,1001")); 
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case6 completed");
    }
    @Test
    public void case7(){  
    	try {
			
    		//System.out.println("Test case 7 started");
			assertEquals(3,app.add("//[**]\n1**2"));
			assertEquals(3,app.add("//**\n1**2"));
			assertEquals(6,app.add("//[***]\n1***2***3"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case7 completed");
    }
    @Test
    public void case8(){  
    	try {
			
    		//System.out.println("Test case8 started");
			assertEquals(6,app.add("//[*][%]\n1*2%3"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case8 completed");
    }
    @Test
    public void case9(){  
    	try {
			
    		//System.out.println("Test case9 started");
			assertEquals(3,app.add("//[**]\n1**2"));
			assertEquals(3,app.add("//**\n1**2"));
			assertEquals(15,app.add("//[&&&][;;;]\n1&&&5;;;9"));
		} catch (STExceptions e) {
			System.out.println("Exception is: "+e.getMessage());
		}
         
    	//System.out.println("Test case9 completed");
    }
}
