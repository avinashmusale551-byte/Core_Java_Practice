package collection;
import java.util.*;
public class TreeSet5 {

	public static void main(String[] args) {
		
		TreeSet<Home> tree=new TreeSet<Home>(new namecomparator());
		Home h=new Home("Avinash","my self",22,5);
		Home h2=new Home("satish   musale","dady",53,6);
		Home h1=new Home("tanuja  musale","mom",42,4);
		Home h3=new Home("Ashwinimusale","Sister",24,7);
		
		
		tree.add(h);
		tree.add(h1);
		tree.add(h2);
		tree.add(h3);
		
		System.out.println(tree);
		
		
		

	}

}
class Home {
	String name;
	String FamilyRelation;
	int age;
	int height1;
	
	public Home(String name,String FamilyRelation,int age,int height1){
		super();
		this.name=name;
		this.FamilyRelation=FamilyRelation;
		this.age=age;
		this.height1=height1;
		
	}

	
	public String toString() {
		return "Home [name=" + name + ", FamilyRelation=" + FamilyRelation + ", age=" + age + ", height=" + height1
				+ "\n";
	}

	
	
}
class AgeComaparator implements Comparator<Home>{

	
	public int compare(Home o1, Home o2) {
		
		return Integer.compare(o1.age, o2.age);
	}}
class FamilyRelationcomparator implements Comparator<Home>{

	@Override
	public int compare(Home o1, Home o2) {
		
		return Integer.compare(o1.FamilyRelation.length(),o2.FamilyRelation.length());
	}
}
class namecomparator implements Comparator<Home>{
	public int compare(Home o1,Home o2) {
		return Integer.compare(o1.name.length(), o2.name.length());//compares with length of character 
	}
}
class height1comparator implements Comparator<Home>{
	public int compare(Home o1,Home o2) {
		return Integer.compare(o1.height1, o2.height1);
	}
}
	