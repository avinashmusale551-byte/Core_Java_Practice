package avi.java;

import java.util.Scanner;
public class number_check {
	public static void main(DataTypeSize[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		double num=sc.nextDouble();
		if(num<0) {
			System.out.println("Negative number.");
		}
		else if(num>0 && num%2==0) {
			System.out.println("Positive and Even number.");
		}
		else if(num==0) {
			System.out.println("Zero.");
		}
		else {
			System.out.println("Decimal or odd");
		}
		
	}

}
