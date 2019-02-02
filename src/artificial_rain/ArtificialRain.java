package artificial_rain;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtificialRain {
	public static int artificialRain(final int[] v) {
		
		if (v.length <= 1) return v.length;
		
		int result = 0;
		
		for (int i = 0; i < v.length; i++) {
			int rangeCounter = 1;
			rangeCounter += ArtificialRain.calculateExtension(v, i);
			
			if (rangeCounter > result) result = rangeCounter;
			
		}     
		
		return result;
    }
	
	public static int calculateExtension(int[] arr, int groundPos) {
		int extension = 0;
		
		int groundPosLeft = groundPos;
		int groundPosRight = groundPos;
		
		while (groundPosLeft - 1 >= 0 || groundPosRight + 1 < arr.length) {
			if (groundPosLeft - 1 >= 0 && arr[groundPosLeft] >= arr[groundPosLeft - 1]) {
				extension++;
				groundPosLeft--;
			} else if (groundPosRight + 1 < arr.length && arr[groundPosRight] >= arr[groundPosRight + 1]) {
				extension++;
				groundPosRight++;
			} else {
				break;
			}
			
		}
				
		return extension;
	}

}
