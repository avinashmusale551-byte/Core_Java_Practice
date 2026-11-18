package MultiThreading;

public class Multi6 {

	public static void main(String[] args) {
		
		theatre tht=new theatre();
		
		Thread t=new Thread(()->{
			System.out.println("booking 1");
			tht.bookseat(" avi ", 6);
		});
		
		System.out.println("-------------------");
		Thread t1=new Thread(()->{
			System.out.println("booking 2");
			tht.bookseat("Ravi", 3);
			
		});
		System.out.println("---------------------");
		Thread t2=new Thread(()->{
			System.out.println("booking 3");
			tht.bookseat("Shami", 4);
		});
		
		t.start();
		t1.start();
		t2.start();

	}

}
class theatre{
	int seats=10;
	public synchronized void bookseat(String name,int num) {
		System.out.println("user arrived:"+name+"wants to book seat:"+num);
		
		if(seats>num) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("available seats to book:");
			this.seats=this.seats-num;
			System.out.println("user:"+name+"booked seats:"+num);
			System.out.println("remaining seats:"+this.seats);
		}
		else {
			System.out.println("sorry! seats not available");
		}
	}
}