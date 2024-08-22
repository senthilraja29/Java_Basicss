package Day26_5Aug_try_catch;

import java.util.Arrays;

public class Assignment_047_array_outbound 
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[4];
			numbers[0]= 5;
			numbers[1]= 15;
			numbers[2]= 25;
			numbers[3]= 35;
		System.out.println("Before Exeption " 
			+ Arrays.toString(numbers));
		try {
			numbers[4] = 45;
			System.out.println(Arrays.toString(numbers));
		}
		catch(ArrayIndexOutOfBoundsException q1){
			System.out.println("Exception Handled");
			System.out.println("After Exeption " 
			+ Arrays.toString(numbers));
		}
	}
}
