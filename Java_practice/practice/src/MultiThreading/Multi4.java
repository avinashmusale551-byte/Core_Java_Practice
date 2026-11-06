package MultiThreading;

public class Multi4 {

	public static void main(String[] args) throws InterruptedException {
		multi g=new multi();
		
		
		g.start();
		g.join(1);
		
		
		System.out.println("good morning");
		
		g.join(3000);
		System.out.println("good afternoon");
		

	}
}
class multi extends Thread
{
	public void run() {
	try {
		Thread.sleep(5000);
		System.out.println("good evening");
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}}
}
	

