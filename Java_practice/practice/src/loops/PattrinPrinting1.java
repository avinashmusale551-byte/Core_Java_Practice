package loops;

public class PattrinPrinting1 {
	
//half triangle # print.
	
	public static void main(String[] args) {
		int n=5;
		for(int j=1;j<=n;j++) {//1=>
			for(int k=1;k<=j;k++) {//1=>
				System.out.print("#");
				
			}
			System.out.println(); //it prints new for every iteration.
			
			
		}
		/*
		 * outer loop j is for 5 rows.
		 * and inner loop k is printing # which is value is j.
		 * when row=1 and column=1 print #=>1
		 * when row=2 and column=2 print #=>2
		 */

	}

}
