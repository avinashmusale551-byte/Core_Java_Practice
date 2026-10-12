package constructor;

public class Con_jumping {
					
	
	public static void main(String[] args) {
		/**
		 * using this() constructor call
		 * and constructor jumping.
		 * 
		 * pattern=
		 * A=>D=>C=>B
		 * D=>B=>A=>C
		 * B=>A=>D=>C
		 * C=>B=>A=>D
		 */
		Airoplane air=new Airoplane(2,6,4,5);//going to D
		

	}

}
class Airoplane{
	
	public Airoplane(int n) {//going to B
		this(2,5);
		System.out.print("A=>");
		
	}
	
	public Airoplane(int i,int u) {//going to c
		this(1,1,1);
		System.out.print("B=>");
	}
	public Airoplane(int i,int j,int p) {//End at C
		
		System.out.print("C=>");
		
	}
	public Airoplane(int i,int j,int k,int v) {//going to A
		this(1);
		System.out.print("D=>");
	}
}