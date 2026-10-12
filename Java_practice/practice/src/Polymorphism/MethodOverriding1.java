package Polymorphism;

public class MethodOverriding1 {

	public static void main(String[] args) {
		CreditCard cr=new CreditCard();
		cr.pay(1000);

	}

}
class Payment{
	public void pay(double amount) {
		System.out.println("Pay the regular payment."+amount);
	}
}
class Atm extends Payment{
	public void pay(double amount) {
		System.out.println("pay amount with atm."+amount);
	}
}
class CreditCard extends Payment{
	public void pay(double amount) {
		System.out.println("pay amount with ceditcard"+amount);
	}
}