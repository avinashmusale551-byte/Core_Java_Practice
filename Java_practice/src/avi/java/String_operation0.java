package avi.java;

import java.util.Scanner;
public class String_operation0 {

	public static void main(String[] args) {
		//String s="java";

		
		//System.out.println(s==s1);
		
	/*	String a=s.toUpperCase();
		//System.out.println(a);
		String name="jackson";
		String fullname=name.concat("action");
		System.out.println(fullname);
*/
		/**
		 * .equals() is used to check the content of the string.
		 */
		
	/*	String p=new String("java");
		String s1=new String("java");
		System.out.println(p.equals(s1));
		System.out.println(p==s1); */
		
		String original="slaap";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		//System.out.println(original);
	//	System.out.println(reversed);
		String t="welcome to pune !";
		for(int i=0;i<t.length();i++) {
			
			if(t.charAt(i)=='a'||t.charAt(i)=='e'||t.charAt(i)=='i'||t.charAt(i)=='o'||t.charAt(i)=='u');
			{
				System.out.print("*");
			}
		//	else{
				System.out.print(t.charAt(i));
			}
		}
	}

//}
