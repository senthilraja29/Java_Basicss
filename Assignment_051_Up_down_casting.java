package Day28_29_8Aug;

class upcast	// parent class
{
	static void name1() 
	{	System.out.println("Raja");	}
	static void reg1() 
	{	System.out.println(1001);	}
	void location1() 
	{	System.out.println("chennai");	}
	void state1() 
	{	System.out.println("TamilNadu");		}
}
class downcast extends upcast // child class
{	static void name2() 
	{	System.out.println("Senthil");	}
	static void reg2() 
	{	System.out.println(1002);		}
	void location2() 
	{	System.out.println("Bangalore");	}
	void state2() 
	{	System.out.println("Karnataka");	}
}
public class Assignment_051_Up_down_casting 
{
	public static void main(String[] args) 
	{
		upcast s1 = new downcast();		
		s1.name1();
		s1.reg1();
		s1.location1();
		s1.state1();
		downcast s2 =  (downcast) s1; //explicit way
		s2.name2();
		s2.reg2();
		s2.location2();
		s2.state2();
		System.out.println("Accessing Parent class properties");
		s2.name1(); s2.reg1(); s2.location1(); s2.state1();
	}
}
