package Hello_world;

public class comparison_and_other_operator {

		public static void main(String[] args) {
			int a = 10 ;
			int b = 20 ;
			if (a == b)
				System.out.println(" value of a and b is equal");
			if (a != b)
				System.out.println(" value of a and b is not equal");
			if (a > b)
				System.out.println(" value of a is higher");
			if (a < b)
				System.out.println(" value of b is higher");
			if (a >= b)
				System.out.println(" value of a is greater than equal");
			if (a <= b)
				System.out.println(" value of a is less than equal");
			
			System.out.println("---------------------------------------------");
			
			// Conditional of && is AND --- || is OR
			
			if ((a != b) && (a < b))
				System.out.println("And condition passed");
			
			if ((a == b) || (a < b))
				System.out.println("OR condition passed");
			
			System.out.println("---------------------------------------------");
			
			
			
	}

}
