package LambdaExpression;
import java.util.function.Consumer;
import java.util.List;
public class FunctionalInterfaceConsumer3 {

	public static void main(String[] args) {
		
		List<Integer> l1=List.of(11,523,456,845,9,7,5,2,5,552,5,1,63,2,2301,58,9564,7,8);
		List<Integer> l2=List.of(569,4,7,8,55,5,1,115,5,4,221,823,2,556,22,33,47,8,9,5,1,6,6,23,2);
		
		Even_numbers eve=new Even_numbers();
		eve.accept(l1);
		System.out.println("\n********2nd list is below*********\n");
		eve.accept(l2);
		

	}

}

class Even_numbers implements Consumer<List<Integer>>{
	
	
	public void accept(List<Integer> t) {
		for(int i=0;i<t.size();i++) {
			if(t.get(i)%2==0) {
				
				System.out.println("even no:"+t.get(i));
			}
			else {
				
				System.out.println("\nodd numbers:"+t.get(i));
			}
		}
		
	}
}