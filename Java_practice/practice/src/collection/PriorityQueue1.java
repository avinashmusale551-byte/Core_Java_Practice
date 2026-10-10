package collection;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
		pr.add(23);
		pr.add(11);
		pr.add(7);
		pr.add(5);
		pr.add(55);
		pr.add(10);
		pr.add(105);
		pr.add(65);
		//pr.add(null);//it will not allow null elements
		
		System.out.println(pr);
		System.out.println(pr.remove(23));
		System.out.println(pr);
		System.out.println(pr.poll());
		System.out.println(pr.poll());
		System.out.println(pr.add(4));
		System.out.println(pr);
		
		
		

	}

}
