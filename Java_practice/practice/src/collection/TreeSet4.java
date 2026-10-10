package collection;
import java.util.*;//import all i need 
public class TreeSet4 {

	public static void main(String[] args) {//opening main method
		TreeSet<Students> set=new TreeSet<Students>(new heightComparator());//creating treeset object of student to store.
		//creating three student objects using 3 parameters of type integer.
		Students stud=new Students(12,56,5);
		Students stud1=new Students(22,62,6);
		Students stud2=new Students(20,65,4);
		
		//adding into the three objects into the set.
		set.add(stud);
		set.add(stud1);
		set.add(stud2);
		System.out.println(set);

	}

}

//creating class students and implementing comparable
class Students implements Comparable<Students>{
	
	int age;
	int weight;
	int height;
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Students(int age,int weight,int height){
		super();
		this.age=age;
		this.weight=weight;
		this.height=height;
		
		
	}
	@Override
	public String toString() {
		return "Students [age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
		
	
	}


class ageComparator implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
	
	
}
class weightComparator implements Comparator<Students>{
	
	public int compare(Students o1,Students o2) {
	return Integer.compare(o1.weight,o2.weight);
	}
	
}
class heightComparator implements Comparator<Students>{
	public int compare(Students o1,Students o2) {
		return Integer.compare(o2.height,o1.height);
		
	}
}