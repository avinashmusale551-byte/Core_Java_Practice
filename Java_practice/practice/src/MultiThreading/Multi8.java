package MultiThreading;
import java.util.*;
public class Multi8 {

	public static void main(String[] args) throws InterruptedException {
	
		sharedResource rc=new sharedResource();
		
		Thread th1=new Thread(()->{
			while(true) {
				try {
					rc.producer();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread th2=new Thread(()->{
			while(true) {
				try {
					Thread.sleep(2000);
					rc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		th1.start();
		th2.start();

	}
}
class sharedResource{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	
	int counter=1;
	public void producer() throws InterruptedException {
		
		synchronized(this) {
		while(arr.size()>=10) {
			System.out.println("producer memory full..");
	wait();
		}
		System.out.println("adding the element:"+counter);
		arr.add(counter);
		counter++;
		notify();
	}}
	public void consumer() throws InterruptedException{
		synchronized(this) {
		while(arr.isEmpty()) {
			System.out.println("it is empty now");
			wait();
		}
		System.out.println("removing the element:");
		arr.remove(0);
		
		
		System.out.println("notifying prducer");
		notify();
	}}
}