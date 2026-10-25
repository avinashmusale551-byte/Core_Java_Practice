package LambdaExpression;

import java.util.function.Function;
public class FunctionalInterfaceFunction3 {

	public static void main(String[] args) {
		
		Function<String,String> ho=(t)->{return t.stripTrailing();};
		
		System.out.println(ho.apply("mobile		"));
		System.out.println(ho.apply("locked		"));

	}
}
