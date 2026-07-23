package avi.java;

public class Objects_method {

	public static void main(String[] args) {
		
		bank show=new bank();
		show.name="avinash";
		show.transaction=50000;
		//show.mobno=7559133892;
		show.Add="sadguru residency b-4 shivane,pune.";
		
		System.out.println(show.name);
		System.out.println(show.transaction);
		System.out.println(show.Add);
		
		show.BankSystem();
		

	}
}

class bank{
	double transaction;
	String name;
	String Add;
	double mobno;
	
	public void BankSystem(){

		System.out.println("doing payments.");

	}
}
