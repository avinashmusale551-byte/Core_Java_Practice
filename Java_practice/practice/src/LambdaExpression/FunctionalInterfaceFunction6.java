package LambdaExpression;
import java.util.function.Function;
import java.util.List;
public class FunctionalInterfaceFunction6 {

	public static void main(String[] args) {
		
		Function<String,String> hell=(l)->l.repeat(3);
		
		Function<String,String> well=hell.compose(j->j.concat("  Java World  \n"));
		
		System.out.println(well.apply("Hello"));
		System.out.println(well.apply("welcome"));
		System.out.println(hell.apply("---- THE END -----\n"));
		

	}

}
