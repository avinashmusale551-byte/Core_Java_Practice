package Strings;

public class PracticeString5 {

	public static void main(String[] args) {
		
		
		String string="Welcome to the java";
		String ReverseString="";
		
		for(int i=string.length()-1;i>=0;i--){
			
			ReverseString=ReverseString+string.charAt(i);
		}
		System.out.println("String: "+ string);
		System.out.println("ReverseStrings: "+ReverseString);

	}

}
