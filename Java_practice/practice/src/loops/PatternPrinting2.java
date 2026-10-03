package loops;

public class PatternPrinting2 {

	public static void main(String[] args) {
		//right upper # triangle print
		int n=1;
		for(int i=5;i>=n;i--) {//5,4,3,2,1.
			for(int j=1;j<=i;j++) {//1,2,3,4,5.
				System.out.print("#");
				
			}
			System.out.println();
		}

	}

}
