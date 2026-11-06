package MultiThreading;

public class Multi3 {

	public static void main(String[] args) {
		
		Student std=new Student();
		
		for(int i=0;i<50000;i++) {
			std.incre();
		}
		for(int i=0;i<50000;i++) {
			std.incre();
		}
		
		System.out.println(std.getID());

	}

}
class Student{
	int id;
	
	public void incre() {
		this.id++;
	}
	public int getID() {
		return this.id;
	}
}