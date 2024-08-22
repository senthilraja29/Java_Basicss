package Day_two;

import java.util.PriorityQueue;
import java.util.Queue;

import Day_three.Access_modifiers;

public class Q_ueue {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<>();
		
		que.add("Tamilnadu");
		que.add("Bangalore");
		que.add("Hydrabad");
		que.add("Mumbai");
		
		System.out.println("Priority is " + que);	
		
		que.remove();
		System.out.println("After removal of que is " + que);
	
		String heads = que.peek();
		System.out.println("After implementing peek in que is " + heads );
	
		String tails = que.poll();
		System.out.println("After implementing poll its remove heads in que is " + tails );
		System.out.println("Final que is " + que);
		

	}

}
