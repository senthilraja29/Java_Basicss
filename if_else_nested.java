package Hello_world;

public class if_else_nested {

	public static void main(String[] args) {
		int Discount;
		int A, B;
		
		char offer;
		
		Discount = 18;
		
		if (Discount <= 20) 
			offer = 'v';
		
			else if (Discount <= 40)
			offer = 's';
			
			else if (Discount <= 60)
				offer = 'm';
			
			else if (Discount <= 80)
				offer = 'l';
		
			else
				offer = 'F';
			System.out.println(offer);
		
			System.out.println("---------------------------------------");
		
		A = 30;
		B = 25;
		int C = A + B;
		if (A + B == 30)
			System.out.println("C is equal to 30 ");
			if (C < 50)
				System.out.println("C is less than to 50 ");
				if (C > 50)
					System.out.println("C is higher than to 50 ");
			
			System.out.println("---------------------------------------");
		
		// Terrnary operator
			
			int x, y ,z ;
			x = 20;
			y = 30;
			z = x > y ? x : y;
				
			if (z == x)
				System.out.println("Z value is x " + z);
			else 
				System.out.println("Z value is y " + z);
					
			
	}

}
