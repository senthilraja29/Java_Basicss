package Day_Four;

public class polymorphism {

	
	static int add(int a, int b) {
		return a+b;
	}
	
	
	static double add(double a, double b) {
		return a+b;
	}

	
	static void check(char a) {
		System.out.println("your input is character");
	}
	static void check(String a) {
		System.out.println("your input is String");
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(add(10,20));
		System.out.println(add(15.3,25.6));
		check('k');
		check("Happy");
		
		

	}

}
