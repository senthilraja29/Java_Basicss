package Advance;


// we define a cell of our grid
public class A_algorithm {

	// coordinates
	public int a,b;
	// parent cell for path
	public A_algorithm parent;
	// Heuristic cost of the current cell
	public int heuristicCost;
	// Final Cost
	public int finalCost; // H+G with
	//G(n) the cost of the path from the start node to n
	// and H(n) the heuristicCost that estimates the cost of the cheapest path from n to goal.
	public boolean solution //  if the cell is part of teh solution path 
	
	public A_algorithm(int a, int b) {
			this.a= a;
			this.b = b; }


	@Override
	public String toString() {
		return "A_algorithm [a=" + a + ", b=" + b + "]";
	}


	
		
	}
	
	
	
	
	
	
	
}
