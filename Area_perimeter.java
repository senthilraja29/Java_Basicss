package Beginner;

// in this utili scanner option is there.
import java.util.*;

public class Area_perimeter {

	// This is going to idetify perimeter of the rectangle
	
	
	public static void main(String[] args) {
		Scanner length = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle - ");
		Double Rec_length = length.nextDouble();  // Read user input	
		
		Scanner Width = new Scanner(System.in);
		System.out.println("Enter Width of the Rectangle - ");
		Double Rec_Width = length.nextDouble();  // Read user input
		
		System.out.println("Rec_length is: " + Rec_length);
		System.out.println("Rec_Width is: " + Rec_Width);
		
		Double Area_of_rectangle = Rec_length * Rec_Width;
		Double Area_of_perimeter = 2*(Rec_length + Rec_Width);
		
	//	System.out.println("Area_of_rectangle is: " + Area_of_rectangle);
	//	System.out.println("Area_of_perimeter is: " + Area_of_perimeter);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 for Rectangle & 2 for Perimeter");
		Integer Area_input = input.nextInt(); 
		
		if ( Area_input == 1)
			System.out.println("Area_of_rectangle is: " + Area_of_rectangle);
		
			else if ( Area_input == 2)
				System.out.println("Area_of_perimeter is: " + Area_of_perimeter);
			
			else
				System.out.println("Invalid Input");
	}
	
	
	

}
