package chapter3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReorderOddEvenTest {

	int[] A = {1, 2, 3, 4, 5};
	int[] B = {1, 5, 3, 4, 2};
	
	@Test
	public void testModify() {
		assertArrayEquals(B, new ReorderOddEven().modify(A));
	}

}
