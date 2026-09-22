package Numbers;

public class PrimeNumbers3 {
	public static void main(String[] args) {
		
		
		System.out.println("first 1000 prime numbers - \n");
		int s=1;
		String v=")";
		int numbers=2;
		while(numbers<1000) {
			
			boolean isprime=false;
			for(int i=2;i<numbers;i++) {
				if(numbers%i==0) {
					isprime=true;
				}
				
			}
			
			if(!isprime) {
				System.out.println(s+v+" "+numbers);
				s++;
			}
			numbers++;
		}

	


	
	}
}
