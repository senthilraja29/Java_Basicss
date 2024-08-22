package Day24_1Aug;

public class Access_speacifier_private_sample_test extends Access_speacifier_in_class
{
	public static void main(String[] args) 
	{
		Access_speacifier_in_class a1 = new Access_speacifier_in_class();
		a1.			// Unable to view the Private Access speacifier 
		add();
		multi(); // Private Access speacifier
		divi();
		sub();
	}
}
