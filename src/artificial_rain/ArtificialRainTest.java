package artificial_rain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArtificialRainTest {
	    @Test
	    public void basicTests() {
	        doTest(new int[]{2}, 1);
	        doTest(new int[]{1,2,1,2,1}, 3);
	        doTest(new int[]{4,2,3,3,2}, 4);
	    }
	    private void doTest(final int[] numbers, final int expected) {
	        assertEquals(expected, ArtificialRain.artificialRain(numbers));
	        assertEquals(9, ArtificialRain.artificialRain(new int[] {1, 2, 3, 2, 2, 4, 8, 9, 8, 8, 7, 5, 6}));
	        assertEquals(6, ArtificialRain.artificialRain(new int[] {7, 10, 8, 7, 4, 4, 6, 6, 5, 8, 1, 6}));
	        assertEquals(8, ArtificialRain.artificialRain(new int[] {7, 10, 8, 7, 4, 4, 6, 6, 6, 8, 10, 6}));
	    }

}
