package Inheritance;

public class MultipleInheritance {

	public static void main(String[] args) {
		
		
	avinash avi=new avinash();
	 
	ashwini ash=new ashwini();
	
	System.out.println(avi.land);
	System.out.println(ash.land);
	avi.Home();
	ash.Home();

	}

}
class satish{
	String land="20 acre";
	public void Home() {
		System.out.println("Home sweet home.");
	}
}
class avinash extends satish{
	
}
class ashwini extends satish{
	
}