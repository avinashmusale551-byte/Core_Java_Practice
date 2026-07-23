package avi.java;

public class primenumbers2 {

	public static void main(DataTypeSize[] args) {
		
		int counter=0;
		
		for(int num=2;num<=1000;num++) {
			boolean IsPrime=true;
			for(int i=2;i<num;i++) {
			if(num%i==0 ) {
				IsPrime=false;
				break;
			}
			}
		
		if(IsPrime) {
			counter++;
			System.out.println("prime number: "+num);
		}
		}System.out.println("\nToatal prime numbers: "+counter);

	}

}
