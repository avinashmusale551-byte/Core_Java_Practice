package Object_Classes;

public class ObjectCreation2 {

	public static void main(String[] args) {
		
		bank show=new bank();
		show.name="avinash";
		show.transaction=50000f;
		show.mob="7559133892";
		show.Add="sadguru residency b-4 shivane,pune.";
		
		System.out.println(show.name);
		System.out.println(show.Add);
		System.out.println(show.mob);
		System.out.println(show.transaction+" Rs");
		
		show.BankSystem();
		

	}
}

class bank{
	float transaction;
	String name;
	String Add;
	String mob;
	
	public void BankSystem(){
		
		String cus="Going in bank";

		System.out.println(cus+" and doing payments.");

	}
}
