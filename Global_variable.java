package Day08_10July;

public class Global_variable {
		
	int a = 100; //  Assign variables within class is called global variable - non static
	int b = 100;	//	declaration and initiate only possible in global variable - non static
	// int a;	// if we declaration(alone) the variable within class it through's error
	static int x = 11; //  Assign variable by using static  
	static int y = 13; //  Assign variable by using static
	
	
	Global_variable() 
	{	int c = a + b;	//utilize the global variable in constructor
		System.out.println("Addition (constructor) " + c);
		System.out.println("\ngloabal variable a = " + a +"\ngloabal variable b = " + b +"\n" );
		a = 35; //update the gloabal variable of a without datatype int,shot,byte, long
		b = 20; //update the gloabal variable of b without datatype int,shot,byte, long
		System.out.println("Calling static global variable in constructor " + (x + y) );
	}
	
	void subtrac_display()
	{	int c = a - b;	//utilize the global variable in non static method
		System.out.println("\nSubtraction (non static method)(a & b - updated ) " + c);
		int sub = x - y; 
		System.out.println("Calling static global variable in non static method " + sub);	}
	
	static void multi_display()
	{	/* int c = a - b;	//we can't utilize the global variable without static
	System.out.println(c);  */  
		int z = x * y; 
		System.out.println("\nMultiplication (Static method) "
				+ "(static global variable), updated (x &y) " + z);	}				
	
	public static void main(String[] args) {
	 
/*	static int x = 100;  	 // we can't update global variable within method and datetype
	static int y = 50;		*/ 
	
	Global_variable glo = new Global_variable();
	
	System.out.println("\nvalue of x is " + x);
	System.out.println("value of y is " + y);
	
	glo.subtrac_display();
	x = 100;	// static variable is not required object to initiate or declare
	y = 50;		// static variable is not required object to initiate or declare
	System.out.println("\nUpdated value of x is " + x);
	System.out.println("Updated value of y is " + y);
	
	multi_display();
	
	// we can’t able to call out non static global variable without object
	// System.out.println("gloabal varialble a = " + a +"\ngloabal varialble b = " + b);
	
	System.out.println("\nCall out the non static global variable by using object");
	System.out.println("Updated gloabal variable a = " + glo.a 
			+"\nUpdated gloabal variable b = " + glo.b);
	
		}
}
