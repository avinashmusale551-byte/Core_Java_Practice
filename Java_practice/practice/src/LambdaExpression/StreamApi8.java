package LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Map;

public class StreamApi8 {

	public static void main(String[] args) {
		
	List<String> str=List.of("Avinash","Satish","Musale","Satish","Nivrutti","Musale","Nivrutti","Kisan","Musale");
		
		Map<Integer,List<String>> mp=str.stream()
			.distinct()
			.collect(Collectors.groupingBy(i->i.length()));
			
			
		
		System.out.println(mp);

	}

}
