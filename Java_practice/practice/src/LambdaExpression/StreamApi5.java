package LambdaExpression;

import java.util.List;

public class StreamApi5 {

	public static void main(String[] args) {
		
		List<Integer> li=List.of(54,65,78,65,91,32,45,6,4,10,3,32,5,99,5,622,895,45,21,3,6,9,8,1,2,5,5,3,356,5,85);
		
		System.out.println(li);
		
		li.stream()
		.filter((i)->{return i>10;})
		.distinct()
		.sorted()
		.forEach(i->System.out.println(i));
		

	}

}
