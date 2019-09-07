
public class KnapsackSolver {

	public static int[][] buildTable(Order[] orders, int costLimit, int timeLimit){
	// Problem #1
	// Fill in this method to create a (costLimit + 1) by (timeLimit + 1) table
	// that for each (i, j) stores the maximum number of cookies that can be
	// produced with cost at most i in time at most j.
		int newCostlimit = (costLimit/10)+1;
		int[][] table = new int[newCostlimit][timeLimit+1];

		for(int i = 0; i< newCostlimit; i++){
			for(int j = 0; j <=timeLimit; j++){
				
			}
		}
		return null;
	}

	public static Multiset solve(Order[] orders, int costLimit, int timeLimit){
	// Problem #2
	// Fill in this method to create a multiset that represents a combination of
	// cookie choices that maximizes the number of cookies with cost at most 
	// costLimit in time at most timeLimit.  Note: You can call buildTable as
	// a subroutine.

		Multiset response = new Multiset;
		response.add(orders[0], 11);
		response.add(orders[1], 2);
		response.add(orders[2], 0);
		response.add(orders[3], 0);
	
		return response;
	}
	
}