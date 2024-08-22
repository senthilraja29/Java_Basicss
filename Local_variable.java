package Day08_10July;

public class Local_variable {
	
	Local_variable(){ 				// local variable with in constructor
		int a = 10;
		System.out.println(a);
	/*	a = 14;						// we can able to update the variable with in constructor
		System.out.println(a); */
	}
	
	void display() { 				// Local variable in non static method 
		String day = "Monday";
		System.out.println(day);
	/*	day = "Tuesday";			// we can able to update the variable with in non static method 
		System.out.println(day); */
		
	}
	
	static void d_play() {			// local varibale in static method
		boolean x = true;
		System.out.println(x);
	/*	boolean x = false;			// we can able to update the variable with in static method 
		System.out.println(x);	 */					
		
	}
	
	public static void main(String[] args) { // local variable in main method 
		double q = 10.23456;
		
		new Local_variable();	// calling constructor
		
		int a = 11;				// we can't change the constructor variable in main method
		
		Local_variable day1 = new Local_variable(); // create object & calling constructor
		
		day1.display(); 		// non static variable utilize 
		d_play();				// static variable utilize
		System.out.println(q); 	// main method variable utilize
		
		String day = "Tuesday";
		day1.display(); 		// we can't change the non static method variable in main method
		boolean x = false;
		d_play(); 				// we can't change the static method variable in main method
		
		q = 11.354687;
		System.out.println(q);	// we update the main method variable without return type
	}
}
