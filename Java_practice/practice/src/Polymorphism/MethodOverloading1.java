package Polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		pune p=new pune();
		p.shivane(0, 0);
		p.shivane("");
		p.shivane(0, 0, 0);

	}

}
class pune{
	public void shivane(int i,int b) {
		System.out.println("this is shivane.");
	}
	public void shivane(int k,int v,int p) {
		System.out.println("cdjcnnc");
	}
	public void shivane(String l) {
		System.out.println("jSJND");
	}
}
