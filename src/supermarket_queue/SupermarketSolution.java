package supermarket_queue;

public class SupermarketSolution {
	
	public static int solveSuperMarketQueue(int[] customers, int n) {
		int result = 0;
		
		// create n tills
		int[] tills = new int[n];
		
		for (int till : tills) {
			till = 0;
		}
		
		//add customers to tills
		int currentTill = 0;
		for (int customer : customers) {
			
//			result += customer;
		}
		
		return result;
	}

}
