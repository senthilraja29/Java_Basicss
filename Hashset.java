package Day_two;


import java.util.*;



public class Hashset {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<>();
		
		hashset.add("Q");
		hashset.add("A");
		hashset.add("Z");
		hashset.add("C");
		hashset.add("C");
		
		boolean y1 = hashset.add("X");
		System.out.println(y1);
		
		boolean y2 = hashset.add("X");
		System.out.println(y2);
		
		System.out.println("Check the value contains X ? "+ hashset.contains("X"));
		
		System.out.println(hashset);
		
		hashset.remove("D");
		System.out.println(hashset);
	}
}
