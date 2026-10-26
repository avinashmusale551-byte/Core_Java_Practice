package LambdaExpression;

public class GenExpression5 {

	public static void main(String[] args) {
		
		I_dev<String,Integer,Integer> dev=(t1,a1)->{
			return t1.length()+a1;
		};
		
		System.out.println(dev.add("Next:", 420));

	}

}

interface I_dev<T,A,R>{
	R add(T t1,A a1);
}