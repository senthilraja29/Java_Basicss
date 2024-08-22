package Day11_15July;

public class AND_or_NOT_operator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if ((a == 10) || (b == a)) // c1 true - c2 false
		{
			System.out.println("This is OR Operator");
		}
		
		if ((a == 10) && (b == 20)) // c1 true - c2 true
		{
			System.out.println("This is AND Operator");
		}
		
		if (!(a == 10) && (b == 20)) // c1 true - c2 true but it won't excute
		{
			System.out.println("This is NOT Operator 1");
		}
		
		if (!(a == 10) || (b == 2)) // c1 true - c2 true but it won't excute
		{
			System.out.println("This is NOT Operator 2");
		}
		
	}
}
