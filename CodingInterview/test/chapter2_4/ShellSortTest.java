package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShellSortTest {

	int[] A = {8, 2, 7, 1, 3, 5, 6, 4};
	int[] B = {1, 2, 3, 4, 5, 6, 7, 8};
	
	@Test
	public void testGetSort() {
		assertArrayEquals(B, new ShellSort().getSort(A));
	}

}
