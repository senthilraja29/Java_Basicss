package Day_Four;

public class recursion_methods {

	static int fact (int n) {
		
		if (n==0)
			return 1;
		return n*(fact(n-1));
	
	}
	

	public static void main(String[] args) {
		int n = 6;
		System.out.println(" factorial of n is "+ (fact(n)));
	}
		
}
