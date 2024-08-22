package Day25_2Aug;

public class Order_of_execution 
{
	static 
	{
		System.out.println("SIB executed");
	}
	{
		System.out.println("IIb executed");
	}
	Order_of_execution()
	{
		System.out.println("Constructor executed");
	}
	Order_of_execution(int x)
	{
		System.out.println("Constructor executed with para");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method Executed");
		new Order_of_execution();
		new Order_of_execution();//creating object makes multiple result in IIB and Constructor 
		new Order_of_execution(20);
	}
	
	
}
