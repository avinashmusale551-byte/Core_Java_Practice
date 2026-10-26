package LambdaExpression;
import java.util.function.Supplier;
public class FunctionalInterfaceSupplier2 {

	public static void main(String[] args) {
		
		Supplier<Integer> employee=()->{return 47260017/500;};
		
		System.out.println(employee.get());

	}
}

