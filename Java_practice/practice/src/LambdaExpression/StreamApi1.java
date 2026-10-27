package LambdaExpression;
import java.util.function.Consumer;
import java.util.List;

public class StreamApi1 {

	public static void main(String[] args) {
		
		List<Integer> li=List.of(12,3,4,4,54,4663,266,243,545,353,2,2,3233,444,54545565,7,676,76,76,7,67,6,76,7,67,64,32424243,5686785,32,3,12,3);
		
		
		li.stream()
		.filter(i->i<100)
		.filter((i)->{return i%2==0;})//intermediate operation
		.forEach((i)->{System.out.println(i);});//terminal operation
		
		

	}

}
