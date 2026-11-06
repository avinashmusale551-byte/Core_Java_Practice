package MultiThreading;

public class Multi2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread("Pizza");
		Thread t2=new Thread("Burger");
		
		t1.start();
		t2.start();
		

	}

}
class runnableexample implements Runnable{
	
	private String dish;
	
	public runnableexample(String dish) {
		this.dish=dish;
	}

	@Override
	public void run() {
		
		System.out.println("cooking:"+dish+"on thread:"+Thread.currentThread().getName());
	}
	
}