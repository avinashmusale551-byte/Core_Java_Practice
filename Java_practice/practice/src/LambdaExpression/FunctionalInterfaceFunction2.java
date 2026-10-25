package LambdaExpression;
import java.util.function.Function;
public class FunctionalInterfaceFunction2 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> ht=(num)->{return num.sum(45, 89);};
		
		System.out.println(ht.apply(0));
		

	}

}