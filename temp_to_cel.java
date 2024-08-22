package Beginner;

import java.util.*;
import java.text.*;

public class temp_to_cel {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Press 1. Celcious or 2.Ferenhit or 0.Exit - ");
		Integer input_value = value.nextInt();
		DecimalFormat df = new DecimalFormat("#.##");
		
		if ( input_value == 1 ) {
				System.out.println("You are choosing Celcious convertor");
				Scanner f = new Scanner(System.in);
				System.out.println("\nPlease enter the value of Ferenhit is ");
				Double input_Ferenhit = f.nextDouble();
				Double C = ((input_Ferenhit -32)/1.8);
				System.out.println(df.format(input_Ferenhit) + " This ferhrenhit is into celcious in " + df.format(C));	
	
		}
				else if ( input_value == 2 ) {
					System.out.println("\n You are choosing Ferenhit convertor");
					Scanner c = new Scanner(System.in);
					System.out.println("Please enter the value of Celcious is ");
					Double input_celcious = c.nextDouble();
					Double F = ((input_celcious*1.8)+32);
					System.out.println(df.format(input_celcious) + " This Celcious is into Ferenhit in " + df.format(F));
				}
					else
					{			System.out.println("Thank You");		}
			
				
	}

}
