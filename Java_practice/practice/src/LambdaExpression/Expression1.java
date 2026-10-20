package LambdaExpression;

public class Expression1 {
	
		/**
		 * Anonymous class example
		 * 
		 */
	
	public static void main(String[] args) {
		
		I_run r=new I_run() {
			public int run() {
				System.out.println("------");
				return 500;
			}	
			public void demo() {
				System.out.println("*******");
				System.out.println(200+300);
			}
		};
		
		int j=r.run();
		System.out.println(j);
		r.demo();

	}
}

interface I_run{
	int run();
	void demo();
}

/*class son implements I_run{
	public int run() {
		System.out.println("*****");
		return 300;
	}
}*/