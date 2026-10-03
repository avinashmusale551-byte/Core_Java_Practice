package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
	String password="ABC@123";
	String s=new String("AbC@123");
	try {
		if(password.equals(s)) {
			System.out.println("You Logged in successfully.");
		}
		else {
			throw new Exception("its invalid password.");
		}}
	
	catch(Exception ex){
	//	System.out.println(ex.getMessage());
		ex.printStackTrace();
	}
		
	
	System.out.println("Code successfully run");
	

	}

}
