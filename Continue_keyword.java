package Day24_1Aug;

public class Continue_keyword 
{
	public static void main(String[] args) {

	for(int b = 0; b <= 5; b ++)
	{
		if(b == 4) 
		{
		//	System.out.println("Value of B crossed " + b);
			continue;
		}
		System.out.println(b);
	}
	}
}
