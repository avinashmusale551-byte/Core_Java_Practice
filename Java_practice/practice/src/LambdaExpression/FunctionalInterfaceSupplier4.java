package LambdaExpression;
import java.util.function.Supplier;
public class FunctionalInterfaceSupplier4 {

	public static void main(String[] args) {
		
		Supplier<Double> kot=()->{return 45230.01+20.36-53*2;};
		
		System.out.println(kot.get());

	}

}
