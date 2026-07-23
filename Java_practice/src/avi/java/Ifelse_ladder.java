package avi.java;

public class Ifelse_ladder {

	public static void main(DataTypeSize [] args) {
		double marks=35.98;
		if(marks>=35 && marks<60.99) {
			System.out.println("C Grade");
		}
		else if(marks>=61 && marks<=80.99) {
			System.out.println("B Grade");
		}
		else if(marks>=81 && marks<=100) {
			System.out.println("A Grade");
		}
		else if(marks>100){
			System.out.println("Invalid marks entry.");
		}
		else {
			System.out.println("Fail");
		}
	}
}
