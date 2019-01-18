package supermarket_queue;

import java.util.ArrayList;

public class SupermarketSolution {
	
	public static int solveSuperMarketQueue(int[] customers, int n) {
		int result = 0;
		
		for (int customer : customers) {
			result += customer;
		}
		
		return result;
	}

}
