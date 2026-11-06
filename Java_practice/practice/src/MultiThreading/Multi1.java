package MultiThreading;

public class Multi1 {

	public static void main(String[] args) {
		
		Thread t=new Thread();
		Thread t1=new Thread();
		t1.start();
		t.start();
		
		for(int i=0;i<=100;i++) {
		if(i%2==0) {
			System.out.println(i);
		}

			try {
				Thread.sleep(100);
			}
			catch(InterruptedException c) {
				c.printStackTrace();
			}
		}
		t.run();
		
		

	}

}
