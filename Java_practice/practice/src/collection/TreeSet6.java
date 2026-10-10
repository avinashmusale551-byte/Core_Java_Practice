package collection;
import java.util.*;
public class TreeSet6 {

	public static void main(String[] args) {
		TreeSet<Hospital> set=new TreeSet<Hospital>();
		Hospital h1=new Hospital("Nivrutti",1023,"knee pain");
		Hospital h2=new Hospital("Mathura",1024,"knee pain,body pain,fever");
		Hospital h3=new Hospital("Satish",1025,"Back pain");
		
		set.add(h1);
		set.add(h2);
		set.add(h3);
		
		System.out.println(set);
		
		

	}

}

class Hospital implements Comparable<Hospital>{
	
	String pname;
	int pid;
	String disease;
	
	//create constructor
	public Hospital(String pname,int pid,String disease) {
		super();
	this.pname=pname;
	this.pid=pid;
	this.disease=disease;
	}

	//Override toString method
	public String toString() {
		return "Hospital [pname=" + pname + ", pid=" + pid + ", disease=" + disease + "]";
	}
	
	//add compareTo method to implement comparable	
	public int compareTo(Hospital o) {
		return Integer.compare(o.pname.length(), this.pname.length());
	}
	
	
	
}