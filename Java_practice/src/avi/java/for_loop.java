package avi.java;

public class for_loop {

	public static void main(DataTypeSize[] args) {
		int counter=0;
		System.out.println("Divisible by (2,3,4,5) numbers:");
		for(int i=1;i<=100;i++) {
			
			if(i%2==0 && i%3==0 && i%4==0 && i%5==0 ) {
			//break;//break will terminate the for block statement stop the execution of the for loop.
			//continue;//continue statement is used for when you want to skip some specific condition  value.
			
				
				System.out.println(i);
			counter++;
			}
			
		}
		System.out.println("Count:"+counter);
}
}