package program_practice;

public class primeno {

	public static void main(String[] args) {
		int num=2;
		int count=0;
		int index=1;
		System.out.println("1 to 170 prime numbers: \n");
		
	while(count<170) {
			boolean isprime=false;
			for(int i=1;i<num;i++) {
				if(i==1) {
					continue;
				}
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
		}
		
		

	}


