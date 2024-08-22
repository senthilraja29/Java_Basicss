package Day25_2Aug;

public class IIB_Instance_Initiation_block 
{
	{		//IIB
		System.out.println("IIB ");
	}
	{		//IIB
		System.out.println("IIB 3");
	}
	
	static 	//SIB
	{
		System.out.println("SIB in iib project");
	}
	public static void main(String[] args) //main method
	{
		System.out.println("Main Method");
		new IIB_Instance_Initiation_block();
		new IIB_Instance_Initiation_block();
	}
	
	{		//IIB
		System.out.println("IIB 2");
	}
}
