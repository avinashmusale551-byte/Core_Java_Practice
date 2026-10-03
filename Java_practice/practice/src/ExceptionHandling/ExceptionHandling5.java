package ExceptionHandling;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		
		String Trl="red";
		try {
			if(Trl.equals("red")) {
				throw new Redsignalexception("lol");
			}
			else {
				System.out.println("proceed.");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

	}

}
class Redsignalexception extends RuntimeException{
	public Redsignalexception(String str) {
		super(str);
	}
}