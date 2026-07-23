package avi.java;

import java.util.Arrays;
import java.util.List;

public class string_operation1 {

	public static void main(String[] args) {
		/**
		 * .equalIgnorecase() method
		 * .split() method
		 * .join() method
		 * .equals() method
		 * 
		 */
		String A="AVINASHSATISHMUSALE";
		
		String B=new String("AVINASH SATISH MUSALE");
		
		String C=new String("avinashsatishmusale");
		
		String D=String.join("+","Red","Blue","Green","Yellow");//its join the string.
		
		String E=("Cat,Dog,Rabbit,Parrot");
		
		 List.of("Java", "is", "cool");
	     String Animal = String.join(" ", );

		
		
		String lower=B.toLowerCase(); //its make a lowercase letters of uppercase letters.
		
		String upper=C.toUpperCase();//its make a uppercase letters of lowercase letters.
		
		System.out.println(lower);
		System.out.println(upper);
		
		System.out.println(A.equals(B)); // true =>directly compare with actual value inside a variable.
		
		System.out.println(A.equalsIgnoreCase(C));//true it ignore the cases(capital/small) of letters.
		
	    System.out.println(D);
	    
	    System.out.println(Animal);
		
		
		

	}

}
