package LambdaExpression;

import java.util.List;

public class StreamApi2 {

	public static void main(String[] args) {
	
		List<String> st=List.of("Avinash","ravi","sunny","shubham","soham","abhishek","pravin","tejas");
		
		st.stream()
		.filter(i-> i.length()<8)
		.forEach(i->System.out.println(i));

	}

}
