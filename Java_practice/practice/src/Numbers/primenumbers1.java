package Numbers;

public class primenumbers1 {

	public static void main(String[] args) {
	
	
	/**1) W.A.P to find first 251 prime numbers.=> Done.
	  * 2)W.A.P to find prime numbers between range 1-1000.=>
	  * 3)W.A.P to print fibonacci series.=>
	*/
		       
		       int counter=0;
		       int number=2;
		       int total=0;
		       while(counter<1000)
		       {
		       boolean flag=true;
		       for(int i=2;i<number;i++)
		       {
		           if(number%i==0)
		           {
		               flag=false;
		           }
		       }
		       if(flag)
		       {
		           counter++;
		           total++;
		           System.out.println("Prime number:"+number+"  "+"Total="+total);
		          
		       }
		       number++;
		       }
		   
		       }

		}
