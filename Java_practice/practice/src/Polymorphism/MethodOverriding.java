package Polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		dog fog=new dog();
		fog.sound();

	}

}
class Animal{
	public void sound() {
		System.out.println("Animal Make a sound");
	}
}
class dog extends Animal{
	public void sound() {
		System.out.println("dog can barke");
	}
}