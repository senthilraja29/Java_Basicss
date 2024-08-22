package Day28_29_8Aug;

public class Primitive_type_casting_1 
{
	public static void main(String[] args) 
	{
		int a = (int)65.98; 
		System.out.println(a); //narrowing
		
		
		double abc1 = 866.976;
		int abc2 = (int) abc1; // narrowing
		System.out.println(abc1); 
		System.out.println(abc2); 
	}
}
