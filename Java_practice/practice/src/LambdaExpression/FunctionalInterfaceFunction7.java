package LambdaExpression;
import java.util.function.Function;
public class FunctionalInterfaceFunction7 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> sl=Function.identity();
		
		System.out.println(sl.apply(56));

	}

}
