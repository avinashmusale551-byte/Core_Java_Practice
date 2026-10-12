package constructor;

public class Constructor1 {   

	public static void main(String[] args) {
		
		/**
		 *CONSTRUCTOR INJECTION
		 * when ever you  create constructor injection 
		 * you need to access the instance variables
		 * using this. keyword to access current class variable
		 * also called as 'instance variable call'.
		 */
		
		
		Football f=new Football("ass",100,'d');
		
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(f.letter);
		
		
		

	}

}
class Football{
	int price;
	String name;
	char letter;
	
	public Football(String s,int i,char c) {
		
		
		this.name=s;
		this.letter=c;
		this.price=i;
		
	}
	
	
}