package program_practice;
import java.util.Arrays;
public class PracticeString1 {

	public static void main(String[] args) {
		/**
		 * .replace() method
		 * .equalIgnorecase() method
		 * .split() method
		 * .join() method
		 * .equals() method
		 * .toUppercase()
		 * .toLowercase()
		 * 
		 */
		String A="AVINASH:SATISH:MUSALE";
		
		String B=new String("AVINASHSATISHMUSALE");
		
		String C=new String("avinashsatishmusale");
		
		String D=String.join("+","Red","Blue","Green","Yellow");//its join the string.
		
		String E=A.replace(":", "-");
		
		String[] F=A.split(":");

		
		
		String lower=B.toLowerCase(); //its make a lowercase letters of uppercase letters.
		
		String upper=C.toUpperCase();//its make a uppercase letters of lowercase letters.
		
		System.out.println(lower);
		System.out.println(upper);
		
		System.out.println(A.equals(B)); // true =>directly compare with actual value inside a variable.
		System.out.println(A.equalsIgnoreCase(C));//true it ignore the cases(capital/small) of letters.
		
	    System.out.println(D);//join with the "+" symbol.
	    System.out.println(Arrays.toString(F));
	    System.out.println(E);
	    
	    
	
		
		
		

	}

}
