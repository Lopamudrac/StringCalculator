package com.demo.st;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.st.exception.STExceptions;

/**
 * Hello world!
 *
 */
public class App 
{
   public int add(String number) throws STExceptions {
	   int sum=0;
	   List<Integer> negative= new ArrayList<Integer>();
	   if(!number.trim().isEmpty()) {
		try {
			int[] numArray = Arrays.stream(number.split(",|\n|;")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			for (int i = 0; i < numArray.length; i++) {
				if(numArray[i]<0) {
					negative.add(numArray[i]);
					sum=0;
				}
				else if(numArray[i]>=1000) {
					numArray[i]=0;
				}
				else {
					sum=sum+numArray[i];
				}
				
			}
			if(negative.size()>0) {
				sum=0;
				throw new STExceptions("Negative num not allowed! Please correct the following "+negative);
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
