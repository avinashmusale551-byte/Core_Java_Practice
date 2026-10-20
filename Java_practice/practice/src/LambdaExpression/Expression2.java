package LambdaExpression;

public class Expression2 {
	
	/**
	 * 
	 * Anonymous class ex-2
	 */

	public static void main(String[] args) {
		
		I_animal an=new I_animal(){
			public void run() {
				System.out.println("running...");
				
			}
			public void eat() {
				System.out.println("non-veg");
			}
			public int maxspeed() {
				System.out.print("max speed is:");
				return 300;
			}
			
		};
		
		an.eat();
		an.run();
		System.out.print(an.maxspeed());
		
		

	}
}

interface I_animal{
	void eat();
	void run();
	int maxspeed();
}
