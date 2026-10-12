package Polymorphism;

public class MethodOverriding2 {

	public static void main(String[] args) {
		hero h=new hero();
	//	h.fan();
		Garden j=new farmer();
		j.gulab();
		


	}

}
class Garden{
	protected int gulab() {
		System.out.println("this is the gulab method in parent class.");
		return 0;
	}
}
class farmer extends Garden{
	protected int gulab() {
		System.out.println("this is the gulab method in child class.");
		return 0;
	}
}
class land extends Garden{
	protected int Land() {
		System.out.println("5 acre.");
		return 0;
	}
}
class hero extends Garden{
	public void fan() {
		System.out.println("heros have always fan.");
	}
}