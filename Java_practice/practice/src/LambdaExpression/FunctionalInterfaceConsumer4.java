package LambdaExpression;

import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class FunctionalInterfaceConsumer4 {

	public static void main(String[] args) {
		
		
		List<List<Integer>> matrix = Arrays.asList(
			Arrays.asList(1, 2, 35,65,52,1,48,4,2,7894,2,235652,262,212,23,5,6),
			Arrays.asList(4, 5, 6,90,32,4,5213,43,53,2,6,67,88,2334,987,3234,7865,233)
		);
		
		Twodarray two = new Twodarray();
		
		System.out.println(matrix);
		
		System.out.println("--- Processing 2D List Numbers ---");
		two.accept(matrix);
	}
}


class Even_Numbers1 implements Consumer<List<Integer>> {
	
	@Override
	public void accept(List<Integer> t) {
		for(int i = 0; i < t.size(); i++) {
			if(t.get(i) % 2 == 0) {
				System.out.println("even no: " + t.get(i));
			} 
		}
	}
}


class Twodarray implements Consumer<List<List<Integer>>> {
	
	Even_Numbers1 num = new Even_Numbers1();

	@Override
	public void accept(List<List<Integer>> t) {
		for(int i = 0; i < t.size(); i++) {
			
			num.accept(t.get(i));
		}
	}	
}
