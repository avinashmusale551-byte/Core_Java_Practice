package LambdaExpression;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class FunctionalInterfacePredicateStreamApi1 {
	
	public static void main(String [] args) {
		
		
	
		List<String> words = Arrays.asList("rhythmi", "orange", "fly", "umbrella", "crypt");
		
		Predicate<String> hasvowels=str->str !=null && str.matches(".*[aeiouAEIOU].*");

		List<String> anyvowels=words.stream()
				.filter(hasvowels)
				.collect(Collectors.toList());
		
		System.out.println("Words with vowels:"+anyvowels);
		
	

	
	
	

}
}