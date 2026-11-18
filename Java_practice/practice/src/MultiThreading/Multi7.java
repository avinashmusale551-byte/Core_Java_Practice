package MultiThreading;

public class Multi7 {

	public static void main(String[] args) {
		
		bus B=new bus();
		
		Thread t1=new Thread(()->{
			System.out.println("first booking");
			B.seatbooking(" Avinash ", 12);
		});
		Thread t2=new Thread(()->{
			System.out.println("second booking");
			B.seatbooking(" mahesh ", 10);
		});
		Thread t3=new Thread(()->{
			System.out.println("third booking");
			B.seatbooking(" nitesh ", 4);
		});
		Thread t4= new Thread(()->{
			System.out.println("fourth booking");
			B.seatbooking(" kumar ", 5);
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}
}
class bus{
	int Totalseats=27;

	public synchronized void seatbooking(String name,int seats){
		
		System.out.println("user:"+name+"want to book seats:"+seats);
		
		if(Totalseats>seats) {
			try {
				Thread.sleep(4000);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			this.Totalseats=this.Totalseats-seats;
			
			System.out.println(seats+" booked seats by user: "+name);
			System.out.println("Available seats: "+Totalseats);
		}
		else {
			System.out.println("Sorry ! Seats Not Available!");
		}
		
	}
}