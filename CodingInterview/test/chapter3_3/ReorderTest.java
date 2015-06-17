package chapter3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReorderTest {

	int[] A = {1, 2, 3, 4, 5};
	int[] B = {1, 5, 3, 4, 2};
	
	int[] A1 = {2, 4, 6, 1, 3, 5};
	int[] B1 = {5, 3, 1, 6, 4, 2};
	
	int[] A2 = {5, 3, 1, 6, 4, 2};
	int[] B2 = {5, 3, 1, 6, 4, 2};
	
	int[] A3 = null;
	
	int[] A4 = {};
	
	int[] A5 = {1};
	
	@Test
	public void testModify() {
		assertArrayEquals(B, new Reorder().modify(A, new isEven()));
	}
	
	@Test
	public void testModify1() {
		assertArrayEquals(B1, new Reorder().modify(A1, new isEven()));
	}

	@Test
	public void testModify2() {
		assertArrayEquals(B2, new Reorder().modify(A2, new isEven()));
	}
	
	@Test
	public void testModify3() {
		assertArrayEquals(null, new Reorder().modify(A3, new isEven()));
	}
	
	@Test
	public void testModify4() {
		assertArrayEquals(A3, new Reorder().modify(A3, new isEven()));
	}
	
	@Test
	public void testModify5() {
		assertArrayEquals(A5, new Reorder().modify(A5, new isEven()));
	}
	
}
