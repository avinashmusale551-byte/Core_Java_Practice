package LambdaExpression;

import java.util.function.*;
public class FunctionalInterfacePredicate2 {

	public static void main(String[] args) {
		
		Predicate<String> pre=str->str.length()>5;
		
		
		Predicate<Integer> gre= num-> num>25;
		Predicate<Integer> gre2= sum-> sum<30;
		
		
		System.out.println(pre.test("avinash"));
		
		System.out.println("negate returns opposite:-");
		System.out.println(gre.negate().test(30));
		
		System.out.println("and returns :-");
		System.out.println(gre.and(gre2).test(26));
		
	
		

	}

}
