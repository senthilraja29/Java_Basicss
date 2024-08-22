package Beginner;


import java.util.*;

public class MinMaxValues {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Find minimum and maximum values
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // Display the minimum and maximum values on a digital display
        displayDigital(min);
        System.out.println();
        displayDigital(max);

        scanner.close();
    }

    // Method to display a number on a digital display
    public static void displayDigital(int number) {
        String[] digits = {
            " _     _  _     _  _  _  _  _ ",
            "| |  | _| _||_||_ |_   ||_||_|",
            "|_|  ||_  _|  | _||_|  ||_| _|"
        };

        char[] numChars = String.valueOf(number).toCharArray();
        for (int row = 0; row < 3; row++) {
            for (char numChar : numChars) {
                int digit = Character.getNumericValue(numChar);
                System.out.print(digits[row].substring(digit * 3, (digit + 1) * 3));
            }
            System.out.println();
        }
    }
}

