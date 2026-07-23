package avi.java;

public class array {

	public static void main(DataTypeSize[] args) {
		int[] arr= new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println("***\n---");
		}

	}

}
