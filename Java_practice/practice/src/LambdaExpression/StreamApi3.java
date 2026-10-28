package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class StreamApi3 {

	public static void main(String[] args) {
		
		
		List<Employee1> list=new ArrayList<Employee1>();
		
	list.add(new Employee1("Avinash",89562,1023));
	list.add(new Employee1("Sham",78956,8546));
	list.add(new Employee1("ram",45612,4102));
	list.add(new Employee1("karan",65923,1230));
	
	System.out.println(list);
		
		list.stream()
		.filter(i->i.Salary>1456)
		.forEach(i->System.out.println(i));

	}

}
class Employee1{
	String name;
	double Salary;
	int id;
	
	
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", Salary=" + Salary + ", id=" + id + "]";
	}


	public Employee1(String name,double Salary,int id) {
		this.name=name;
		this.Salary=Salary;
		this.id=id;
	}
}