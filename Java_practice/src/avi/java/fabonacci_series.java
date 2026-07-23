package avi.java;

public class fabonacci_series {
	public static void main(DataTypeSize[] args) {
	int first=0;
	int second=1;
	int next;
	
	System.out.println("fibonacci series: \n");
	
	for(int i=1;i<20;i++) {
		System.out.print(first+" ");
		next=first+second;
		first=second;
		second=next;
	

}
}}