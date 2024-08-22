package Day28_29_8Aug;

public class Assignment_050_datatype 
{
	public static void main(String[] args) 
	{
		byte age1 = 28;
		System.out.println("Int Datatype	"+age1);
		
		short age2 = age1;	//implicit concept
		System.out.println("Short Datatype	implicit concept"+ age2);
		short age3 = (short) age1; //Explicit concept
		System.out.println(("Short Datatype	Explicit concept"+ age2));
	}
}
