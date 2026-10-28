package LambdaExpression;

import java.util.List;
import java.util.ArrayList;

public class StreamApi4 {

	public static void main(String[] args) {
		
		List<Books> books=new ArrayList<Books>();
		
		books.add(new Books("Atomic Habits","james clear",425,200.23));
		books.add(new Books("7 habits of life","robert jr",320,150.33));
		books.add(new Books("life of pi","alex parker",102,300));
		books.add(new Books("the beauty of randomness","admir hashmi",500,350));
		books.add(new Books("psychology of money","locky ferguson",250,280.56));
		
		System.out.println(books+"\n\n");
		books.stream()
		.filter(i->i.Bauthor.contains("o"))
		.filter(i->i.pages>300)
		.map(i-> {return new StringBuffer(i.Bname).reverse();})
		.forEach(i->System.out.println(i));
		
		
		
		
		

	}

}
class Books{
	
	String Bname;
	String Bauthor;
	int pages;
	double price;
	
	public String toString() {
		return "|Book name: "+Bname+"| Book Author:"+Bauthor+"| no.of pages:"+pages+"| Price Rs:"+price;
	}
	
	public Books(String Bname,String Bauthor,int pages,double price) {
		
		this.Bname=Bname;
		this.Bauthor=Bauthor;
		this.pages=pages;
		this.price=price;
		
	}
}