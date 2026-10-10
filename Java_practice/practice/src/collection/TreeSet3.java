package collection;
import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
		
		TreeSet<City1> set=new TreeSet<City1>();
		City1 city=new City1("mumbai",12358928,45213);
		City1 city1=new City1("Pune",3258686,52963);
		City1 city2=new City1("Amravati",3238686,84563);
		
		set.add(city);
		set.add(city1);
		set.add(city2);
		System.out.println(set);
		
		
		
		
		

	}

}
class City1 implements Comparable<City1>

{
	String name;
	int population;
	int pincode;
	
	public City1(String name,int population,int pincode) {
		super();
		this.name=name;
		this.population=population;
		this.pincode=pincode;
	}





	@Override
	public String toString() {
		return "City1 [name=" + name + ", population=" + population + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(City1 o) {
		System.out.println("sorting happen");
		
		return Integer.compare(o.population,this.population);
		
		
	}
	
	
}