package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	int[] A = {4, 5, 5, 9, 6};
	int[] B = {4, 5, 5, 6, 9};
	
	int[] A1 = {2, 8, 7, 1, 3, 5, 6, 4};
	int[] B1 = {1, 2, 3, 4, 5, 6, 7, 8};
	
	@Test
	public void test() {
		assertArrayEquals(B, new QuickSort().sort(A, 0, A.length-1));
	}
	
	@Test
	public void testA1() {
		assertArrayEquals(B1, new QuickSort().sort(A1, 0, A1.length-1));
	}

}
