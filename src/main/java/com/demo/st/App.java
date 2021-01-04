package com.demo.st;


import java.util.Arrays;

import com.demo.st.exception.STExceptions;

/**
 * Hello world!
 *
 */
public class App 
{
   public int add(String number) throws STExceptions {
	   int sum=0;
	   if(!number.trim().isEmpty()) {
		try {
			int[] numArray = Arrays.stream(number.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			for (int i = 0; i < numArray.length; i++) {
				sum=sum+numArray[i];
			}
	   }
		catch(Exception e) {
			throw new STExceptions(e);
		}
	   }
	   System.out.println("input: "+number+"; output: "+sum);
	   return sum;
}
}
