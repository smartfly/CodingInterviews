package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumbersWithSumTest {

	int[] A = {1, 2, 4, 7, 11, 15};
	
	@Test
	public void testFindNumbersA() {
		assertEquals(true, new FindNumbersWithSum().findNumbers(A, 15));;
	}

	@Test
	public void testFindNumbersB() {
		assertEquals(false, new FindNumbersWithSum().findNumbers(A, 27));;
	}
}
