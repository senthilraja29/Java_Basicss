package Day28_29_8Aug;

class ParentTyep
{

}


public class classtype1 extends ParentTyep 
{

public static void main(String[] args) 
{
	ParentTyep p1 = new classtype1(); // upcasting
	// parent class properties
	
	ParentTyep p2 = (ParentTyep)new classtype1(); // upcasting
	//explicit manner
	
	classtype1 C1 =(classtype1) p1; // downcasting
	//explicitly
	
	// both are parenting and child class 
}
}
