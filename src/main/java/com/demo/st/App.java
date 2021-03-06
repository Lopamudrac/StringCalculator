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

			   number = specialCharacterHandler(number);
		   int end = number.indexOf("\n");
		   String demilatorStr= number.substring(0, end+1);
		  numStr= number.substring(end+1, number.length());
		 
		  demilator= demilatorDefiner(demilatorStr);
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
private String specialCharacterHandler(String number) {
	String specialCharacters = "$*()+|?{}\\";
	   for (int i = 0; i < specialCharacters.length(); i++) {
		   String newSp="\\"+String.valueOf(specialCharacters.charAt(i));
		   number = number.replaceAll(newSp,";");
		}
	return number;
}
   public String demilatorDefiner(String numberString) {
	   numberString= numberString.replaceAll("[//\\[]", "").replaceAll("\\]", "|").trim();
	  
	   if(String.valueOf(numberString.charAt(numberString.length()-1)).equals("|")) {
		   numberString= numberString.substring(0, numberString.length()-1);  
	   }
	  // System.out.println("demi: "+numberString);
	   
	   
	return numberString;
	
}
}
