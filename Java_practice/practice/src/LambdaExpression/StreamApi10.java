package LambdaExpression;
import java.util.Arrays;
import java.util.List;

public class StreamApi10 {

	public static void main(String[] args) {
		
		List<employees10> list=Arrays.asList(new employees10("musale",70000,"IT"),
				new employees10("pravin",80000,"HR"),
				new employees10("ashok",45623,"IT"),
				new employees10("ravi",60000,"IT"),
				new employees10("kishore",83000,"sales"),
				new employees10("vikram",80000,"HR"));
		
		System.out.println(list);
		list.stream()
				.filter(i->i.dept.contains("HR"))
				.filter(i->i.salary>75000)
				.forEach(i->System.out.println(i));
				
	

	}
}
class employees10{
	String name;
	double salary;
	String dept;
	


public employees10(String name,double salary,String dept){
	this.name=name;
	this.salary=salary;
	this.dept=dept;
}
public String toString(){
	return name+"($"+salary+")";
	
}
}