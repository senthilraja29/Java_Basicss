package Day_two;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("E");
		list.add("N");
		list.addLast("L");
		list.addFirst("S");
		list.add(2, "THI"); 
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.remove("N");
		System.out.println(list);
	}

}
