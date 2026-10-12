package constructor;

public class SuperCall {

	public static void main(String[] args) {
		Vehicle vl=new Vehicle();
		System.out.println(vl.bullet+100);
		
		

	}

}
class Vehicle{
	int bullet=100;
	class bullet extends Vehicle{
		public void run(int r) {
			System.out.println(super.bullet+r);
		}
	}
}