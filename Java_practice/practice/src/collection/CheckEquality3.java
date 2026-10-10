package collection;

import java.util.Objects;

public class CheckEquality3 {

	public static void main(String[] args) {
		uss c1=new uss(100,"pune");
		uss c2=new uss(100,"pune");
		
		//System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());


	}

}
class uss{
	String name;
	int Price;
	public uss(int Price,String name){
		this.name=name;
		this.Price=Price;
	}

	public int hashCode() {//
		return Objects.hash(this.name,this.Price);
	}
	public boolean equals(Object obj) {
		uss b=(uss)obj;//type casting
		return this.Price==b.Price && this.name.equals(b.name);
	}
	
}