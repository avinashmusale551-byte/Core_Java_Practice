package LambdaExpression;

public class FunctionalInterfaceFunction1 {

	public static void main(String[] args) {
		
		Function<String,String> sk=(str)->{return str.toUpperCase();};
		
		System.out.println(sk.apply("	Avinash Musale 	"));
		System.out.println(sk.apply("	loves eating  	"));	
		
		

	}

}
interface Function<T , R>{
	
	R apply(T t);
}