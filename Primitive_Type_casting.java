package Day28_29_8Aug;

public class Primitive_Type_casting 
{
	public static void main(String[] args) 
	{
		int a = 100;
		double b1 = a; //implicit widining
		System.out.println("b1 is " + b1);
		int b = 101;
		double b2 = (double)b; //explicit widining
		System.out.println("b2 is " +b2);
	}
}
