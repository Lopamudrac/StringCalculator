package com.demo.st;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import com.demo.st.exception.STExceptions;

public class App 
{
   public int add(String number) throws STExceptions {
	   int sum=0;
	  
	   String  demilator=new String();
	   String numStr=new String();
	   if(!number.trim().isEmpty()) {
		   if(number.startsWith("//")) {
		   int end = number.indexOf("\n");
		   String demilatorStr= number.substring(0, end+1);
		  numStr= number.substring(end+1, number.length());
		  demilator= demilatorDefiner(demilatorStr);
		   System.out.println("demi: "+demilator+"num: "+numStr);
		   }
		   else {
			   demilator=",|\n";
			   numStr= number;
		   }
				try {
					int[] numArray = Arrays.stream(numStr.split(demilator)).map(String::trim).mapToInt(Integer::parseInt).toArray();
					 List<Integer> negative= new ArrayList<>();
					for (int i = 0; i < numArray.length; i++) {
						if(numArray[i]<0) {
							System.out.println("negative");
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
					if(!negative.isEmpty()) {
						throw new STExceptions("Negative num not allowed! Please correct the following "+negative);
					}
			   }
			catch(Exception e) {
				throw new STExceptions(e);
			}
		  
	   }
	   System.out.println("input: "+numStr+"; output: "+sum);
	   return sum;
}
   public String demilatorDefiner(String numberString) {
	   System.out.println("numberString: "+numberString);
	   numberString= numberString.replaceAll("//\\[", "").replaceAll("\\[","").replaceAll("\\]", "|").trim();
	   numberString= numberString.substring(0, numberString.length()-1);
	   System.out.println("num Str: "+numberString);
	   
	   
	return numberString;
	
}
}
