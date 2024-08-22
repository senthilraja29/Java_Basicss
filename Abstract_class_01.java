package Day22_30July;

abstract class grand_parent				// Abstract class
{
	abstract void add();
	abstract void subtraction();
	static void multi()
	{
		int x = 10;
		int y = 20;
		System.out.println(x*y);
	}
}
class parent extends grand_parent		// Concrete class
{
	static void divi()
	{
		int x = 10;
		int y = 20;
		System.out.println(x/y);
	}

	@Override
	void add() {
		
	}

	@Override
	void subtraction() {
		
	}
}


public class Abstract_class_01 			// Concrete classs

{
public static void main(String[] args) 
{
	
}
}
