package LambdaExpression;
import java.util.List;
import java.util.function.Function;
public class FunctionalInterfaceFunction4 {
	
	public static void main(String [] args) {
		
		List<Integer> list=List.of(2,3,5,6,4,8,7,9,10,12,15,20);
		
		Function<Integer,Integer> fun=(lot)->lot*lot;
		
		for(Integer i: list)
		System.out.println("square of "+i+":"+fun.apply(i));
		
	}
}
