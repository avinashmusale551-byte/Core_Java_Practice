package LambdaExpression;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class StramApi7 {

	public static void main(String[] args) {
		
		List<String> li=List.of("avinash","pravin","abhishek","tejas","nitesh");
		
		List<String> desc=li.stream()
				.sorted()
		.sorted((a,b)->b.compareTo(a))
		.collect(Collectors.toList());
		
		System.out.println("Original list:\n"+li);
		System.out.println("\n----------------");
		System.out.println();
		System.out.println("\n----------------");
		System.out.println("Below in desc:");
		System.out.println(desc);
		

	}

}
