package LambdaExpression;

import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class FunctionalInterfaceConsumer2 {

	public static void main(String[] args) {
		
		List<employee> li=Arrays.asList(
				new employee("avinash",70000),
				new employee("pravin",80000),
				new employee("ashok",45623));
		
		Consumer<employee> extrabonus=emp->emp.salary+=5000;
		Consumer<employee> extrabonusplus=emp2->emp2.salary+=200;
		
		Consumer<employee> combineconsumer=extrabonus.andThen(extrabonusplus);
		
		employee insertemp=new employee("abhishek",25000);
		combineconsumer.accept(insertemp);
		
		//stream integration
		System.out.println("Before bonus"+li);
		
		
		
		System.out.println("\n--- Processing Full List via .forEach() ---");
		li.forEach(combineconsumer);
		
	System.out.println("\n"+li);

	}

}
class employee{
	String name;
	double salary;
	

public employee(String name,double salary){
	this.name=name;
	this.salary=salary;
}
public String toString(){
	return name+"($"+salary+")";
	
}
}