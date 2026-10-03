package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int salary=8000;
		try {
			if(salary<80000) {
				throw new Exception("Salary is less.");
			}
			else {
				System.out.println("proceed for the loan.");
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
