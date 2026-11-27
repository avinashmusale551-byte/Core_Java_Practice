package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multi9 {

	public static void main(String[] args) {
		Runnable run1=()->{
			for(int i=1;i<=10;i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
				
		};
		
		Runnable run2=()->{
			for(int i=11;i<=20;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};
		
		Runnable run3=()->{
			for(int i=21;i<=30;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};
		
		Runnable run4=()->{
			for(int i=31;i<=40;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};
		
		Runnable run5=()->{
			for(int i=41;i<=50;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};
		
		Runnable run6=()->{
			for(int i=51;i<=60;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		};
		
		ExecutorService ex2=Executors.newCachedThreadPool();
		ex2.execute(run1);
		ex2.execute(run2);
		ex2.execute(run3);
		ex2.execute(run4);
		ex2.execute(run5);
		ex2.execute(run6);
		
		ex2.shutdown();
	

	}

}
