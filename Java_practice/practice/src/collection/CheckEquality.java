package collection;

public class CheckEquality {

	public static void main(String[] args) {
		Car c=new Car("farrari");
		Car c1=new Car("farrari");
		System.out.println(c==c1);
		System.out.println(c.equals(c1));

	}

}
class Car extends Object{
	String k;
	public Car(String k) {
		this.k=k;
	}
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		return this.k.equals(c.k);
	}
}
