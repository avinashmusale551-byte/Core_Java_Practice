package collection;

public class CheckEquality1 {

	public static void main(String[] args) {
		char a=10;
		char b=20;
		City c1=new City("pune");
		City c2=new City("pune");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(a==b);

	}

}
class City{
	String name;
	public City(String name){
		this.name=name;
	}

	public int hashCode() {//
		return this.name.length();
	}
	public boolean equals(Object obj) {
		City c3=(City)obj;//type casting
		return this.name.equals(c3.name);
	}
	
}