package LambdaExpression;
import java.util.function.Supplier;
public class FunctionalInterfaceSupplier3 {

	public static void main(String[] args) {
		
		Supplier<Character> cdg=()->{return 'A';};
		
		System.out.println(cdg.get());
		
		

	}
}
