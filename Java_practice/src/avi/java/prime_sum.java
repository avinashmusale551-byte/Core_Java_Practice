package avi.java;

public class prime_sum {

	public static void main(DataTypeSize[] args) {
		
		int evensum=0;
		int oddsum=0;
		//boolean isprime=true;
		for(int i=1;i<=45;i++)
		{
			if(i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		
		System.out.println("Even numbers sum:"+evensum);
		if(evensum%2==0 || evensum<=1) {
			System.out.println(" not prime number.");
		}
		else {
			System.out.println("is prime number");
		}
		
		System.out.println("\nOdd numbers sum:"+oddsum);
		if(oddsum%2==0 || oddsum<=1){
			System.out.println("not prime number.");
		}
		else {
			System.out.println("is prime number");
		}
	

	}

}
