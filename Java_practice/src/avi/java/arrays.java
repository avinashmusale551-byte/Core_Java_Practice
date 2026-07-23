package avi.java;

//TO CHECK THE HIGHEST VALUE IN ARRAY 
//ARRAY STATIC METHOD TO STORE THE VALUES FROM ZERO TO LENGTH OF ARRAY.
//FAST PROCESSING .
public class arrays {

	public static void main(DataTypeSize[] args) {
		int[] a= {23,24,78,90,145,2397,90,2390};
		int num=-2147483648;
		for(int i=0;i<a.length;i++) {
			if(a[i]>num) {//is 23>0=y,is 24>23=y,78>24=y.
			num=a[i];
			}
		}
		System.out.println(num);//output=>2397

	}

}
