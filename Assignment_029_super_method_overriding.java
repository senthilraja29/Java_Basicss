package Day15_19July;

class India {
	India()
	{	System.out.println("India Prime minister - Modi ");				}
	India(int a){
		System.out.println("India Previous Prime Minister - Modi");}	}

class America  extends India {
	America()		{
		super(100);
		System.out.println("America Prime Minister - Trumph");			}
	America(int b)	{
		super();
		System.out.println("America Previous Prime Minister - Biden");}	}

public class Assignment_029_super_method_overriding extends America{
	
	Assignment_029_super_method_overriding(){
		super(100);
		System.out.println("Country with With President");
	}
	public static void main(String[] args) {		
		Assignment_029_super_method_overriding country = new Assignment_029_super_method_overriding();			
	}
}
