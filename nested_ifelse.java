package Day10_13July;

public class nested_ifelse {

	public static void main(String[] args) {
		
		/*
		1. if
		2. if else 
		3. else if else
		4. Nested if 
		*/
		
		int a = 100;
		int b = 25;
		
		if(a!=b)
		{
			if(a>b)
			{		
				System.out.println("A is Greater than B");
					if(a>50)
					{
						System.out.println("Value of A is more than 50");
					}
					else
					{
						System.out.println("A is lesser than 50");
					}
			}
			else
			{
				System.out.println("A is Lesser than B");
			}
			
		}
		else {
			
			System.out.println("A & B is equal");
		}
	}
	
}
