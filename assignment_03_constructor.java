package Day07_09July;

public class assignment_03_constructor {

	// constructor
	assignment_03_constructor()
	{	System.out.println("Going to call constructor");	}
	
	
	// constructor must be in class name
	/*  
	assignment_03(){
		System.out.println("Calling the construction");
	}
	*/
	
	
	public static void main(String[] args) {
		
	assignment_03_constructor a1 = new assignment_03_constructor(); // Construction calling method 1
	new assignment_03_constructor(); // Construction calling method 2
	
	
	// we cannot assign object name as duplicate 
	/* 
	assignment_03_constructor a1 = new assignment_03_constructor(); 
	*/
	
	// Calling constructor with different name
	assignment_03_constructor a10 = new assignment_03_constructor();
	
	}
}
