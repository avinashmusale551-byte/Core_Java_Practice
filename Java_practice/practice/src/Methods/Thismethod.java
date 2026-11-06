package Methods;

public class Thismethod {

	public static void main(String[] args) {


		//this. call.
		
		city City=new city();
		City.bold();
		
		
	}

}
class city{
	public void bold() {
		this.cold();
		System.out.println("City is rising..");
	}
	public void cold() {
		System.out.println("winter in city...");
	}


	}


