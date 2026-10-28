package LambdaExpression;

import java.util.List;

public class StreamSpi6 {

	public static void main(String[] args) {
     
		
		List<Integer> li=List.of(45,68,21,3,9,7,8,4,5,66,12,2,4,2,3,5,44,5,6,45,5,2,1,23,2,0);
		
		
		li.stream()
		.unordered().sorted().distinct()
		.forEach(i->System.out.println(i));
		
		
		
		

	}

}
