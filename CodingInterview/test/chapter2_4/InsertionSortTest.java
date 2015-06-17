package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	int[] A1 = {8, 2, 7, 1, 4, 4, 6, 4};
	int[] B1 = {1, 2, 4, 4, 4, 6, 7, 8};
	
	@Test
	public void test() {
		assertArrayEquals(B1, new InsertionSort().sort(A1));
	}

}
