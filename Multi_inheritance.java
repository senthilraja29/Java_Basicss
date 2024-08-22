package Day13_17July;

class one
{
	static void add()
	{
		System.out.println("1");
	}

	}
class two extends one
{
	static void sub()
	{
		System.out.println("2");
	}

	}


public class Multi_inheritance extends two {

	public static void main(String[] args) {
		
	sub();
	}
	
}
