package Strings;

public class PracticeString2 {

	public static void main(String[] args) {
		/**
		 * string palindrome program.
		 */

		String s1="1";
		if(s1==""){
			System.out.println("sorry! we dont have any input.");
		}
		else if(s1.charAt(0)==s1.charAt(s1.length()-1)){
			System.out.println("its a palindrome string => "+s1);
		}
		
		else {
			System.out.println("its not palindrome.");
		}
	}
}

