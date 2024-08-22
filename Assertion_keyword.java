package Day25_2Aug;

public class Assertion_keyword 
{
	public static void main(String[] args) 
	{
		int a = 20;
		String b = "Senthil";
	//	assert b.equals("I am Very Sorry");
		assert a < b.length() :("Sorry It won't print");
		System.out.println(a+100);
	}
}
