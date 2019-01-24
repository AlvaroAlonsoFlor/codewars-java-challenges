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
	    }

}
