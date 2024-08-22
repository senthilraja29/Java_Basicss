package Day_three;

import Day_three.Cuboid;

public class Access_modifiers {	
		
		public int A = 10;
		public int B = 20;
		private int C = (A * B);
		protected int D = (B / A);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_modifiers Object = new Access_modifiers();
		
		System.out.println("Value C is " + Object.C);
		System.out.println("Value D is " + Object.D);	
	}
}

/*
 * Access Modifiers - Public, private, default, protected
 * 
 * Public  - Access by all - Shirt, pant, anything open to known
 * private - Access within this class alone  - ATM pin, mobile number
 * default	- relatives and pet, pet names (package - private)
 * protected	- Access by package alone , Marks sheets and job
 * 
 * 
 * 
 * 
 */




