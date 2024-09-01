package Day38_39_22Aug;

class purchase
{
	void shopping()
	{
		System.out.println("Purchasing on offline");
	}
}

public class Assignment_055_poly_run_time extends purchase
{
	@Override
	void shopping()
	{
		System.out.println("Purchasing on online");
	}
	public static void main(String[] args) 
	{
		Assignment_055_poly_run_time  pay1  = new Assignment_055_poly_run_time();
		pay1.shopping();
		purchase pay2 = new purchase();
		pay2.shopping();
	}
}
