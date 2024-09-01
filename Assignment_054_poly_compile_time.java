package Day38_39_22Aug;

class calculator
{
	public int add(int a, int b) 
	{
		return a+b;
	}

	public int add(int a, int b,int c) 
	{
		return a+b+c;
	}
}

public class Assignment_054_poly_compile_time extends calculator
{
	public static void main(String[] args) 
	{
		Assignment_054_poly_compile_time calc = new Assignment_054_poly_compile_time();
		
		System.out.println("Add Two values		" + calc.add(10, 20));
		
		System.out.println("Add Three values	" + calc.add(30, 40, 50));
	}
}
