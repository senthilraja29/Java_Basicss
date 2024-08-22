package Day10_13July;

public class assignment_015_nested_if {

	public static void main(String[] args) {
		
	char M_Gender = 'M';
	char F_Gender = 'F';
	int minimum_age	= 6;
	int maximum_age	= 60;
	
	char traveller = 'M';
	int  traveller_age = 60;
	
	if(traveller == F_Gender)
		{
			System.out.println("Free Ticket for Female Gender");
		}
	else if (traveller == M_Gender) 
		{
			if(traveller_age <= minimum_age)  
				{
					System.out.println("Half Ticket due to Minimum age");
				}
			
			else if(traveller_age >= maximum_age) 
				{
					System.out.println("Half Ticket due to Senior Citizon");
				}
			else if((traveller_age > minimum_age) && (traveller_age < maximum_age))
				{
					System.out.println("Full Ticket");
				}
			else 
				{
					System.out.println("Invalid Age for Male person");
				}
		}

	else 
			{
				System.out.println("Invalid Input in Gender");
			}
	}
}
