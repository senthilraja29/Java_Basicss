package Hello_world;

public class bitwise_operator {

	public static void main(String[] args) {
	
		// bit wise is &,/,^
		// using single "&" just cross checking both even though left as invalid
		// AND (&) , OR (|), XOR (^), NOT (~), Left Shift (<<), Right Shift (>>),Unsigned Right Shift (>>>)
		
		System.out.println("---------------------------------------------");
		
		        int number = 10; // binary: 0000 0101
		        int mask = 20;   // binary: 0000 0011

		        // Bitwise AND (&)
		        if ((number & mask) != 0) {
		            System.out.println("Bitwise AND: The rightmost bit is set.");
		        } else {
		            System.out.println("Bitwise AND: The rightmost bit is not set.");
		        }

		        // Bitwise OR (|)
		        int resultOR = number | mask; // binary: 0000 0111 (5 | 3)
		        System.out.println("Bitwise OR: Result: " + resultOR);

		        // Bitwise XOR (^)
		        int resultXOR = number ^ mask; // binary: 0000 0110 (5 ^ 3)
		        System.out.println("Bitwise XOR: Result: " + resultXOR);

		        // Bitwise NOT (~)
		        int resultNOT = ~number; // binary: 1111 1010 (~5)
		        System.out.println("Bitwise NOT: Result: " + resultNOT);

		        // Left Shift (<<)
		        int resultLeftShift = number << 2; // binary: 0001 0100 (5 << 2)
		        System.out.println("Left Shift: Result: " + resultLeftShift);

		        // Right Shift (>>)
		        int resultRightShift = number >> 2; // binary: 0000 0001 (5 >> 2)
		        System.out.println("Right Shift: Result: " + resultRightShift);

		        // Unsigned Right Shift (>>>)
		        int numberUnsigned = -20; // binary: 1111 1111 1111 1111 1111 1111 1110 1100
		        int resultUnsigned = numberUnsigned >>> 2; // binary: 0011 1111 1111 1111 1111 1111 1111 1011
		        System.out.println("Unsigned Right Shift: Result: " + resultUnsigned);
		  
	}
}
