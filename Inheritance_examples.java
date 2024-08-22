package Day15_19July;

class youtube
{
	youtube()
	{
		System.out.println("youtube");
	}	
	youtube(int a)
	{
		System.out.println("youtube - 200");
	}
}

class google extends youtube
{	
	google()
	{
		//super calling present
		super(200);
		System.out.println("Google");
		
	}
	google(int a)
	{	
		super(200);
		System.out.println("Google - 100");
	}
}

public class Inheritance_examples extends google {

	Inheritance_examples()
	{
	//	super();
	// here super () is present
		super(200);
		System.out.println("Amazon");
	}
	public static void main(String[] args) {
	
		new Inheritance_examples();
	}
}
