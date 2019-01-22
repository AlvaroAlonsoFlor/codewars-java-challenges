package supermarket_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SupermarketSolution {
	
	public static int solveSuperMarketQueue(int[] customers, int n) {
		
		int result = 0;
		
		if (n == 0 || customers.length == 0) {
			return result;
		}
				
		// create n tills
		ArrayList<Integer> tills = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			tills.add(0);
		}
		// add customers to tills
		for (int customer : customers) {
			
			// get minIndex
			int tillIndex = tills.indexOf(Collections.min(tills));
			
			// set new total
			int total = tills.get(tillIndex) + customer;
			tills.set(tillIndex, total);
			
		}
		
		result = Collections.max(tills);
		return result;
	}

}
