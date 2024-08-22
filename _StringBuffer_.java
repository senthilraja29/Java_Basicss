package Day35_16Aug;

public class _StringBuffer_ 
{
	public static void main(String[] args) 
	{
		StringBuffer name1 = new StringBuffer("Senthil Raja 1");
	//	name1.append(" Raja 1");	//modified
		System.out.println(name1);
		name1.substring(7);
		System.out.println(name1);
		name1.subSequence(1, 4);
		System.out.println(name1);
	
	}
}
