package artificial_rain;

import java.util.Arrays;

public class ArtificialRain {
	public static int artificialRain(final int[] v) {
		
		if (v.length <= 1) return v.length;
		
		int result = 0;
		
		// Create and sort unique values
		int[] uniqueValues = Arrays.stream(v).distinct().toArray();
        Arrays.sort(uniqueValues);
        
        // Check coverage
        
        
        for (int i = uniqueValues.length - 1 ; i >= 0; i--) {
        	int rangeCounter = 1;
        	int groundPos = ArtificialRain.findIndex(v, uniqueValues[i]);
        	
        	if (groundPos - 1 >= 0 && v[groundPos] >= v[groundPos - 1]) rangeCounter++;
        	if (groundPos + 1 < v.length || v[groundPos] >= v[groundPos + 1]) rangeCounter++;
        	
        	if (rangeCounter > result) result = rangeCounter;
        }
		
		return result;
    }
	
	public static int findIndex(int[] arr, int element) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) return i;	
		}
		
		return -1;
		
		
	}
}
