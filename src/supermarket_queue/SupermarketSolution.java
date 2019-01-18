package supermarket_queue;

import java.util.ArrayList;
import java.util.List;

public class SupermarketSolution {
	
	public static int solveSuperMarketQueue(int[] customers, int n) {
		int result = 0;
		
		// create n tills
		List<ArrayList<Integer>> tills = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> till = new ArrayList<>();
			tills.add(till);
		}
		
		
		//add customers to tills
		for (int customer : customers) {
//			result += customer;
		}
		
		return result;
	}

}
