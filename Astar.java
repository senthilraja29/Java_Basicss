package Advance;

import java.util.PriorityQueue;

public class Astar {

	// cost for diagnol/vertical and horizontal moves
	public static final int Diagnol_cost = 14;
	public static final int V_H_cost =	10;
	
	// cells for our grid
	private A_algorithm[][]  grid;
	
	// we define the priority queue for open cells
	// open cells : the set fo nodes to be evaluated
	// we put cells into lowest cost in first 
	private PriorityQueue<A_algorithm> opencells;
	
	// Closed cells : the set of nodes already evaluated
	private boolean[][] closedCells;

	//Start cell 
	private int startA, startB;
	
	//End cell
	private int endA, endB;
	
	public Astar(int width, int height, int sa, int sb, int ea, int eb, int[][] blocks) {
		grid = new A_algorithm[width][height];
		closedCells = new boolean[width][height];
		opencells 	= new PriorityQueue<>((A_algorithm a1,A_algorithm a2) -> {
			return a1.finalCost <a2.finalCost ? -1 : a1.finalCost > a2.finalCost ? 1: 0;
		});
		
		startCell(sa, sb);
		endCell(ea, eb);
	
		// int heuristic and cells
		for (int a=0; a < grid.length; a++) {
			for (int b=0; b < grid[a].length; b++) {
				grid[a][b] = new Cell [a][b]
				grid[a][b].heuristicCost = Math.abs(b - endB);
				grid[a][b].solution = false;
			}
	}
	grid[startA][startB].finalCost = 0;
	
	// we put the blocks on the grid
	for (int a = 0; a < blocks.length; a++) {
		addBlockOnCell(blocks[a][b]);	
	}
	}
		
}
video paused at 11.23sec