package Strings;

public class PracticeString4 {

	public static void main(String[] args) {
		
	/*

		 
		
		String original="slaap";
		String reversed="clap";
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		System.out.println(original);
	System.out.println(reversed);*/
		
		/*String t="welcome to pune !";
		for(int i=0;i<t.length();i++) {
			
			if(t.charAt(i)=='a'||t.charAt(i)=='e'||t.charAt(i)=='i'||t.charAt(i)=='o'||t.charAt(i)=='u');
			{
				System.out.print("*");
			}
		}*/
		String Original="avinash";
		String Reversed="";
		
		for(int i=Original.length()-1;i>=0;i--) {
			
			Reversed=Reversed+Original.charAt(i);
		
		}
		System.out.println(" Original String:- "+Original);
		System.out.println("\n Reversed String:- "+Reversed);

	}

}
