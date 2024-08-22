package Hello_world;

public class forloop {

	public static void main(String[] args) {
	
	// for loop makes only two state (initiation and termination)
	for (int value = 1; value < 13 ; value++) 
		{ System.out.println("count  is " + value);}
	
	// enhanced for loop
	int[] values = {10,11,12,13,14,15,16,17,18,19,20};
	
	for (int item : values)
		System.out.println("Value is " + item);
		}
}
