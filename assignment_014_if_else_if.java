package Day10_13July;

public class assignment_014_if_else_if {

	public static void main(String[] args) {
		
	int vote_age = 18;
	
		if (vote_age < 18)
		{	System.out.println("Your age is "+vote_age+" which is lesser than 18."
			+ " You can't vote");	}
		
		else if (vote_age == 18) 
			{	System.out.println("Your age is "+vote_age+" which is exactly 18."
					+ " You can vote now"); }
		
		else if (vote_age > 18)
			{	System.out.println("Your age is "+vote_age+" which is greater than 18."
							+ " You can vote now");	}
		else 
			{
				System.out.println("Invalid age!!! Please enter age in numbers");
			}
	}
	
}
