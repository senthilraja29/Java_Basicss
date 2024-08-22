package Day_two;

import java.util.Stack;

public class S_tacks {

	public static void main(String[] args) {
		
		Stack<String> stacks = new Stack<>();
		
		stacks.push("Bose");
		stacks.push("Gandhi");
		stacks.push("Nerhu");
		stacks.push("V.U.C");
		
		System.out.println("Inside stacks " + stacks);
		
		String Element = stacks.pop();
		System.out.println("Element of removal is " + Element);
		
		System.out.println( "In stacks last object is  removed and rest value is "+ stacks);
		
		String top_most = stacks.peek();		
		System.out.println("top_most of object is is " + top_most);
		
		System.out.println( "After implementing peek is "+ stacks);
		
	}

}
