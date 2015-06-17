package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class InversePairsInArrayTest {

	int[] A = {7, 5, 6, 4};
	
	@Test
	public void testGetInversePairs() {
		assertEquals(5, new InversePairsInArray().getInversePairs(A));
	}

}
