package Day22_30July;
abstract class prime_minister	//Abstract Class
{	abstract void central_minister();
	abstract void finance_minister();
	static void NDRF()
	{	System.out.println("Passing Order to State level "
		+ "Rescue team to Support Kerala State");	}
} 
class chief_minister extends prime_minister  //Concrete Class
{	
	static void requesting() {
		System.out.println("Requesting Central Govt to Announce "
	+ "it as National Disaster");			}	
	@Override
	void central_minister() 		// Override
	{ System.out.println("Release Central Force TO Support");	}
	@Override
	void finance_minister() 		// Override
	{ System.out.println("Release Finance TO Development");	}	
}

public class Assignment_043_abstraction extends chief_minister //concrete
{	public static void main(String[] args) 
	{
	Assignment_043_abstraction disaster = new Assignment_043_abstraction();
	disaster.central_minister();
	disaster.finance_minister();
	disaster.NDRF();
	disaster.requesting();
	}
}
