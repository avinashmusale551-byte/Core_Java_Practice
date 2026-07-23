package avi.java;

public class LOWEST_ARRAY {

	public static void main(DataTypeSize[] args) {
		int [] a= {100,99,87,911,21,85,46,11};
		int num=2147483647;
		for(int i=0;i<a.length;i++) {
			if(a[i]<num) {
				num=a[i];
			}
		}
		System.out.println(num);

	}

}
/**
 * array is non primitive data type in java that is i.e. it is advanced data structure.
 * 
*/