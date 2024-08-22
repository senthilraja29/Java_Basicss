package Beginner;

import java.util.Scanner;

public class SumOfTwoValues { 
	
public static void main(String[] args) {
	


        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you want to find:");
        System.out.println("1. Find Y given X");
        System.out.println("2. Find X given Y");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Find Y given X
            System.out.print("Enter the value of X: ");
            int X = scanner.nextInt();
 
            System.out.print("Enter the value of the sum: ");
            int sum = scanner.nextInt();

            int y = sum - X;

            System.out.println("Given X = " + X);
            System.out.println("The value of Y that satisfies the equation X + Y = " + sum + " is: " + y);
        } else if (choice == 2) {
            // Find X given Y
            System.out.print("Enter the value of Y: ");
            int y = scanner.nextInt();

            System.out.print("Enter the value of the sum: ");
            int sum = scanner.nextInt();

            int X = sum - y;

            System.out.println("Given Y = " + y);
            System.out.println("The value of X that satisfies the equation X + Y = " + sum + " is: " + X);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
