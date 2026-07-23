package avi.java;

public class String_operation2 {

	public static void main(String[] args) {
	/**
	 * 1.stripTrailing()
	 * 2.stripLeading()
	 * 3.isBlank()
	 * 4.isEmpty()
	 */
		String Name="   AVINASH MUSALE.    ";//its stored in String Constant pool which special storage for string in heap.
		
		String Address=new String("Sadguru residency b-4,shivane,pune-411023.     ");//obj in heap
		
		String Standard=new String("     Msc(computer science)"); //obj in heap
		
		String word=new String("JAVA");  //its create an object in heap
		
		String A=new String("JAVA");
		System.out.println(Address.stripTrailing()+"\n");  //strip trailing last white spaces in string.
		
		System.out.println(Standard.stripLeading()+"\n");  //strip leading first white spaces in string.
		
		System.out.println(Name.strip()+"\n");     //strip leading and leading white spaces in string.
		
		System.out.println(Standard.isBlank()+"\n");  //false
		
		System.out.println(word.isBlank()+"\n");  //true
		
		System.out.println(word.isEmpty()+"\n");  //true
		
		System.out.println(A.isEmpty()+"\n"); //false =>because it stores white space
		
		System.out.println(A.isBlank()+"\n");  //true =>because .isBlank() method cannot get white spaces only deal with characters.
		
		System.out.println(word==A); //false => there is two different objects stored in heap memory,its point to different location heap.but in SCP its create only ones.
		
	

	}

}
