package LambdaExpression;

import java.util.stream.IntStream;

public class StreamApi9 {

	public static void main(String[] args) {
		// calculate 1 - 100 Even numbers  without for loop
		
		
		IntStream.rangeClosed(1, 100)
		.filter(i->i%2==0)
		.map(null)
		.forEach(i->System.out.println(i));
		

	}

}
