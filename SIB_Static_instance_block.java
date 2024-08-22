package Day25_2Aug;

public class SIB_Static_instance_block 
{
	static 		//SIB
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
	
	static 		//SIB
	{
		System.out.println("SIB 1");
	}
	
	static 		//SIB
	{
		System.out.println("SIB 2");
	}
	
}
