package Day13_17July;

interface State_bank{
	default void state_bank()
	{	System.out.println("State bank is under RBI");	}
}
interface Indian_bank{
	
	default void indian_bank()
	{	System.out.println("Indian bank is under RBI");	}
}
interface Canara_bank{
	default void canara_bank()
	{	System.out.println("Canara bank is under RBI");	}
}
public class Assignment_027_Multiple_inheritance implements State_bank, Indian_bank, Canara_bank {

	public static void main(String[] args) {
	Assignment_027_Multiple_inheritance banks = new Assignment_027_Multiple_inheritance();
	banks.canara_bank();
	banks.indian_bank();
	banks.state_bank();
	}
}
