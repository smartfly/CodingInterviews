package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinInRotationArrayTest {

	int[] A = {3, 4, 5, 1, 2};
	
	int[] B = {1, 2, 3, 4, 5};
	
	int[] C = {1, 0, 1, 1, 1};
	
	int[] D = null;
	
	int[] E = {1};
	
	@Test
	public void testFindMinValueA() {
		assertEquals(1, new FindMinInRotationArray().FindMinValue(A));
	}
	
	@Test
	public void testFindMinValueB() {
		assertEquals(1, new FindMinInRotationArray().FindMinValue(B));
	}
	
	@Test
	public void testFindMinValueC() {
		assertEquals(0, new FindMinInRotationArray().FindMinValue(C));
	}
	
	@Test
	public void testFindMinValueD() {
		assertEquals(-1, new FindMinInRotationArray().FindMinValue(D));
	}
	
	@Test
	public void testFindMinValueE() {
		assertEquals(1, new FindMinInRotationArray().FindMinValue(E));
	}

}
