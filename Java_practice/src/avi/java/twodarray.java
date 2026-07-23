package avi.java;
import java.util.Scanner;
public class twodarray {

	public static void main(DataTypeSize[] args) {
		
		System.out.println("Enter the Rows you want :- ");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int [][] array=new int[rows][];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Rows are: "+i);
			int columns=sc.nextInt();
			array[i]=new int[columns];
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println("Rows: "+i+" "+"Columns: "+j);
				int element=sc.nextInt();
				array[i][j]=element;
			}
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println(array[i][j]+" ");
			}System.out.println();	
		
		}
	

	}
}
