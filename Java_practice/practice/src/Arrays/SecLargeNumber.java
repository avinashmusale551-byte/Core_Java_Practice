package Arrays;

public class SecLargeNumber {

	public static void main(String[] args) {
		
		int [] array= {10,23,23,45,78,96,12,46,0,491,482,51};
		
		
		int largest=0;
		int seclargest=0;
		int thirdlargest=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				
				thirdlargest=seclargest;//update the value for third
				seclargest=largest;//update the value for second iteration=1:0,2:10,3:23,4:23
				largest=array[i];//update for largest iteration=1:10,2:23,3:23,4:45
			}
			else if(array[i]>seclargest && array[i]!=largest) {
				thirdlargest=seclargest;
				seclargest=array[i];
			}
			
		}
		System.out.println("Largest number:"+largest);
		System.out.println("Second largest number:"+seclargest);
		System.out.println("third largest:"+thirdlargest);
		

	}
}
