package Object_Classes;

public class ObjectCreation1 {

	public static void main(String[] args) {
		
	 Delivery order=new Delivery();
		
		order.productPrice=50000;
		order.customerAdd="shivane,pune.";
		order.productName="LG-LED Smart tv.";
		order.run();
		

	System.out.println(order.productName+"\n"+order.customerAdd+"\n"+order.productPrice);
	
	}}

		class Delivery{
			
				int productPrice;
				String customerAdd;
				String productName;
				
				public void run() {
					String milkha="Run fast";
					}
}