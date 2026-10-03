package loops;

public class PatternPrint4 {
//	Pyramid * print.
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {//row i
			for(int j=i;j<=n;j++) {//space j
				 System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {//columns k
				System.out.print("*");
			}
					System.out.println();
			
			}

}}