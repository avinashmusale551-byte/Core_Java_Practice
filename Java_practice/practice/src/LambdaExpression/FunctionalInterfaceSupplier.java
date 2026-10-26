package LambdaExpression;

public class FunctionalInterfaceSupplier {
	
	//supplier do not take any kind of input and generate/return a fresh output.
	//you need to specify exact name of to get a call for the abstract method present in Supplier interface.
	//it contains one abstract method and no default method inside supplier interface.
	
	public static void main(String [] args) {
		
		Supplier<String> bank=()->{return "Welcome to java";};
		
		System.out.println(bank.get());
		
		
	}
}
interface Supplier<T>{
	T get();
}