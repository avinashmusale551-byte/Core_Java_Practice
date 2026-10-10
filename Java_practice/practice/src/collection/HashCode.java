package collection;

public class HashCode {

	public static void main(String[] args) {
		Student stud=new Student(45,"avi");
		Student stud2=new Student(45,"avi");
		System.out.println(stud.hashCode());
		System.out.println(stud2.hashCode());
		
	}

}
class Student{
	int age;
	String name;

	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
}