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
        	
        	rangeCounter += ArtificialRain.calculateExtensionLeft(v, groundPos);
        	rangeCounter += ArtificialRain.calculateExtensionRight(v, groundPos);
        	
        	if (rangeCounter > result) result = rangeCounter;
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
	
	public static int findIndex(int[] arr, int element) {
		// Need to change this to handle 2 equal numbers
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) return i;	
		}
		
		return -1;		
	}
}
