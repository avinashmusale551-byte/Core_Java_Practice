package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;
public class FunctionalInterfacePredicate1 {

	public static void main(String[] args) {
		
		Predicate<String> islongword= str->str.length()>5;
		
		System.out.println("is apple long:"+islongword.test("Apple"));
		System.out.println("is banana long:"+islongword.test("Banana"));
		

	}

}
