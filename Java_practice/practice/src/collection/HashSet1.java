package collection;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		List<Integer> list=List.of(11,52,25,11,52,18,1,2,22,22,3,1,2,3);
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		System.out.println(set.contains(22));
		System.out.println(set);
		System.out.println(set.containsAll(List.of(1,2,18,3,52,52)));
		System.out.println(set);
		System.out.println(set.remove(22));
		System.out.println(set);

	}

}
