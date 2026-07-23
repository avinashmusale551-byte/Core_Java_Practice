package avi.java;
import java.util.Scanner;
public class prime_practice {

	public static void main(String[] args) {
		System.out.println("Avinash Your prime numbers are: \n");
		
			System.out.print("Enter to check prime no= ");
			
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			boolean isprime=false;
			for(int i=2;i<num;i++) {
				
				if(num==1) {
					isprime=true;
				}
			if(num%i==0 ) {
				isprime=true;
			}
			}
			if(isprime) {
				System.out.println("\n  No,not a prime number! try another.");
			}
			else {
				System.out.println("\n  Yes,this is prime number.");
			}
			
		
		
		
		
		/*while(count<73) {
			boolean isprime=false;
			for(int i=2;i<count;i++) {
				if(num%i==0) {
					isprime=true;
				}
			}
			if(!isprime) {
				count++;
				System.out.println(index+") "+num);
				index++;
			}
			num++;
		}
		*/
System.out.println("\t \n NOTE: PRIME NUMBERS ARE DIVISIBE BY 1 OR ITSELF NUMBER.");
	scan.close();
	}

}
