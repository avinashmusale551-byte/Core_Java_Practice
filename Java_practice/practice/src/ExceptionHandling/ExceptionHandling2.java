package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		int num=1234;
		try {
			if(num%2==0 && num%3==0) {
				System.out.println("its super number");
			}
			else {
				throw new Exception("Not Super number");
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
		System.out.println("Good Evening");

	}

}
