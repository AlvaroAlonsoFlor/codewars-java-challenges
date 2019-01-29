package artificial_rain;

import java.util.ArrayList;
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
        	
        	ArrayList<Integer> groundPositions = ArtificialRain.findIndex(v, uniqueValues[i]);
        	
        	for (int groundPos : groundPositions) {
        		int rangeCounter = 1;
        		rangeCounter += ArtificialRain.calculateExtensionLeft(v, groundPos);
            	rangeCounter += ArtificialRain.calculateExtensionRight(v, groundPos);
            	
            	if (rangeCounter > result) result = rangeCounter;
        	}
        	
        	
        }
		
		return result;
    }
	
	public static int calculateExtensionLeft(int[] arr, int groundPos) {
		int extension = 0;
		
		if (groundPos - 1 >= 0 && arr[groundPos] >= arr[groundPos - 1]) {
			extension++;
			extension += ArtificialRain.calculateExtensionLeft(arr, groundPos - 1);
		}
    	
		return extension;
	}
	
	public static int calculateExtensionRight(int[] arr, int  groundPos) {
		
		int extension = 0;
    	
    	if (groundPos + 1 < arr.length && arr[groundPos] >= arr[groundPos + 1]) { 		
    		extension++;
    		extension += ArtificialRain.calculateExtensionRight(arr, groundPos + 1);
    	}
    	
    	return extension;
	}
	
	public static ArrayList<Integer> findIndex(int[] arr, int element) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) result.add(i);	
		}
		
		return result;		
	}
}
