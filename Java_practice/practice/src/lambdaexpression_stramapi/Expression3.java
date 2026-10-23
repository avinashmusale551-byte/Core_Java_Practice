package LambdaExpression;

public class Expression3 {
	/*
	 * lambda expression ex
	 */

	public static void main(String[] args) {
		
		I_city ci=(p,v)->{return p+v;};
		
		
		System.out.println(ci.display(1,2));

	}
}

interface I_city{
	int display(int p,int v);
}