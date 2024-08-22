package Day26_5Aug_try_catch;

public class Assignment_047_01_assertion 
{
	public static void main(String[] args) 
	{	int Feb_days	= 28;
		int March_days	= 31;
		int April_days	= 30;
		assert March_days > April_days : ("Assert 1 Passed April days are Higher than March");
		System.out.println("March Contains higher days");
		assert Feb_days > March_days : 
			("Assert 2 Passed March days are Higher than Feb");
		System.out.println("Feb Contains Smaller days");
		assert April_days > Feb_days : 
			("Assert 3 Passed April days are Higher than March");
		System.out.println("April Contains higher days");
	}
}
