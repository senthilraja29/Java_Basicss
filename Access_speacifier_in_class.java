package Day24_1Aug;

public class Access_speacifier_in_class 
{
	public static void add() 
	{	
		System.out.println("Add");	
		}
	private static void multi() 
	{	
		System.out.println("multi");	
		}
	protected static void divi() 
	{	
		System.out.println("divi");	
	}
	static void sub() 
	{	
		System.out.println("sub");	
	}	
	public static void main(String[] args) 
	{
		add();
		multi();
		divi();
		sub(); 
	}
}
