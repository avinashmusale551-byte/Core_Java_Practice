package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		//Overloading-method
		world w=new world();
		w.snake("",4,"");
		w.lion(0);
		w.dog("");


	}

}
class world{
	public void lion(int i) {
		System.out.println("lion is walking.");
	}
	public void dog(String s) {
		System.out.println("Dog is Dancing..");
	}
	public void snake(String n,int l,String j) {
		System.out.println("Snake is rolling on the ground.");
	}
}