package ExceptionHandling;

public class ExceptionHandling4 {
public static void main(String[] args) {
	
	//Custom checked exception
	
	int balance=500;
	try {
		if(balance<600) {
			throw new Exception ("Insufficient balance");
		}
		else {
			System.out.println("yes you can pay.");
		}
	}
	catch(Throwable sx) {
		sx.printStackTrace();
	}
	System.out.println("haha");
  }
}
