package recursion;


import java.util.*;

public class TowersOfHanoi {
 
	private static final int NUM_PEGS = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeTowerHanoi(3);

	}

	public static void computeTowerHanoi(int numRings) {
	List<Deque<Integer>> pegs = new ArrayList<>();
	for (int i = 0; i < NUM_PEGS ; i++) {
	pegs.add(new LinkedList <Integer>());
	}
	// Initialize pegs.
    System.out.println("pegs");
	for (int i = numRings; i >= 1 ; --i) {
	pegs.get(0).addFirst(i);	
	System.out.println(pegs.get(0)+ "-" + i);
	}
	System.out.println(pegs.get(0));
	computeTowerHanoiSteps(numRings , pegs, 0, 1, 2);
	}
	private static void computeTowerHanoiSteps(int numRingsToMove,
	List <Deque<Integer>> pegs,
	int fromPeg , int toPeg ,
	int usePeg) {
	if (numRingsToMove > 0) {
	computeTowerHanoiSteps(numRingsToMove - 1, pegs, fromPeg, usePeg, toPeg);
	pegs.get(toPeg).addFirst(pegs.get(fromPeg).removeFirst());
	System.out.println("Move from peg " + fromPeg + " to peg " + toPeg);
	computeTowerHanoiSteps(numRingsToMove - 1, pegs, usePeg, toPeg, fromPeg);
	}
	}

}
