package collection;
import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		//list interface
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<=10000000;i++) {
			arr.add(i);
		}
		System.out.println(arr.get(9999999));
		long end=System.nanoTime();
		
		long start = 0;
		System.out.println("Time:"+(end-start)/10000);
		System.out.println();

	}

}
