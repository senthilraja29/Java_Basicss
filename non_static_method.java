package Day06_08July;

public class non_static_method {

	void add() {
		int a = 25;
		int b = 28;
		
		int sum = a+b;
		System.out.println(sum);
	}
	
	void subtra() {
		int a = 25;
		int b = 28;
		
		int subtraction = a-b;
		System.out.println(subtraction);
	}
	
	
	void multiply() {
		int a = 25;
		int b = 28;
		
		int multiply = a*b;
		System.out.println(multiply);
	}
	
	public static void main(String[] args) {
		
		// by creating an object with the help of refrence variables
		// variable we can call any non static method
		// syntax: classname variable= new classname();
		
		
		non_static_method a1 = new non_static_method();
		a1.add();
		a1.subtra();
		a1.multiply();
	}
	
	
}
