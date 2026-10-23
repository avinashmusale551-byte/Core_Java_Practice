package LambdaExpression;

public class GenExpression6 {

	public static void main(String[] args) {
		
		I_ray<Integer,Integer> ra=(a,b)->{return a+b;};
		
		System.out.println(ra.swing(56, 89));
		

	}
}

interface I_ray<T,R>{
	R swing(T a,T b);
}

class robo{
	public robo(int i,int j) {
		System.out.println("*******");
	}
}