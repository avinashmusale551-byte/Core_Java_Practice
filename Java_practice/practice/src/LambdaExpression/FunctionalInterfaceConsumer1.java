package LambdaExpression;
import java.util.function.Consumer;
public class FunctionalInterfaceConsumer1 {

	public static void main(String[] args) {
		
		Consumer<String> con=s->{
			System.out.println("Enter a name:"+s.toUpperCase());
		};
		con.accept("Avinash Musale");

	}

}
