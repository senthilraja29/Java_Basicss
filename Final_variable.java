package Day08_10July;

public class Final_variable {
	
	final int breadth = 20;	
	final static int width = 30;
	
	final static String name = null ; // we can assign global variable as null
	
	final static int a = 10;
	final static int b = 20;
	
//	int breadth = 20;	we can't modify
	
	Final_variable(){
		int rectangle = breadth * width;
		System.out.println("\nCall out Constructor (final+global) area of rectangle "+ rectangle);
	}
	
	void addition(){
		int c = a + b;
		System.out.println("\nCall out Non static type utilizintg the addition of final variables" + c );
	}
	
	static void subtracion() {
		int d = a - b;
		System.out.println("\nCall out Static type utilizintg the subtracion of final variables" + d );
	}
	
	public static void main(String[] args) {
		System.out.println("We can use final variable in global/local "
				+ "but we can't update or modify");
		
		System.out.println("\nGlobal variable of a " + a +" & b " + b);
		Final_variable a1 = new Final_variable();
		a1.addition(); //call out non static method
		subtracion(); //call out static method
		
		final double pi = 3.14;
		System.out.println("\nAssign final concept in main method (local variable) " + pi);
		System.out.println("Name is " + name ); // global variable is null
		
		
	}
}
