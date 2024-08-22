package Day_Four;

public class exceptions_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = 20;
		
		try {
			int arr[]	= null; // if this function makes error means
			System.out.println(arr[1]);
			c = a/b;
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmatic error");
		}
		catch (Exception e) {
			System.out.println("General Error");
		}
		
		
		System.out.println("print the output of c is " + c);
		System.out.println("Hello Senthil");
		
			
	}

}
