package Day07_09July;

public class constructorss {

	constructorss() // this the method we callled constructors
	
	{
		System.out.println(" This is the type to called constructors");
	}
	
	constructorss(int a) // this the method we callled constructors overloading
	
	{
		System.out.println("\nThis is another type to calling constructors");
		System.out.println("Constructors Overloading");
	}
	
	constructorss(int a, double v) // this the method we callled constructors overloading
	
	{
		System.out.println("\nThis is another type to calling constructors with 2 parameters");
		
	}
	
	/*
	happy(){
		System.out.println("Speacial constructors");   we can call only constructors with class name
	}
	*/
	void add()
	{
		System.out.println("It's method type");
	}
	
	public static void main(String[] args) {
		
		constructorss c1 = new constructorss(); // this is one way
		new constructorss(); // this is another way to call constructor
		new constructorss(0);
		new constructorss(0, 0.3846);
		
		new constructorss().add();
		c1.add();
		constructorss c11 = new constructorss(0); 
	//	constructorss c1 = new constructorss(0); 
	// duplicate object name can't be repeated. even it contains parameterized...
	
	}
}
