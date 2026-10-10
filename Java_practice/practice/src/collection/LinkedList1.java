package collection;
import java.util.LinkedList;

public class LinkedList1 {
	
	//linkedList is also implements deque for the operation.

	public static void main(String[] args) {
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		for(int i=1;i<1000000;i++) {
			li.add(i);
		}
		long start=System.nanoTime();
		
		System.out.println(li.get(490000));
		long end=System.nanoTime();
		
		/*1.it will take much more time for operation like search,insert,remove
		 * when its value is in the middle.
		 * 2.it will faster when the value is close to they first or in the last in the list.
		*/
		System.out.println("\ntime need to reach:"+(end-start)/10000);
		

	}

}
