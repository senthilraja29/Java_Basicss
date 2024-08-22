package Day24_1Aug_Access_speacifier;

interface dollar extends rupees
{
	static void american_currency() {
	System.out.println("Rupees in American Currency");	}
	
}

public class Access_speacifier_Interface_sample_01 implements dollar
{
	public static void main(String[] args) {
		Access_speacifier_Interface_sample_01 s1 = new Access_speacifier_Interface_sample_01();
		rupees.indian_currency();
		dollar.american_currency();
	}
}

