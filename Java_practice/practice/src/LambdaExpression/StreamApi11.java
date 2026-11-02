package LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamApi11 {
	public static long facto(int n) {
		return LongStream.rangeClosed(1, n)
				.reduce(1, (a,b)->a*b);}
	

	public static void main(String[] args) {
		
		
		
		List<Integer> li=List.of(11,7,9,3);
		List<Long> factorials=li.stream()
		.map(StreamApi11::facto)
		.collect(Collectors.toList());
		
		System.out.println(factorials);
		
		

	}

}
