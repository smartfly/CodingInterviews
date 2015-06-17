package chapter5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoreHalfNumTest {

	int[] A = {1, 2, 3, 2, 2, 2, 5, 4, 2};
	
	int[] B = {1, 2, 3, 4, 2};
	
	int[] C = {1};
	
	int[] D = null;
	
	@Test
	public void testFindA() {
		assertEquals(2, new MoreHalfNum(A).find());
	}
	
	@Test
	public void testFindB() {
		assertEquals(-1, new MoreHalfNum(B).find());
	}
	
	@Test
	public void testFindC() {
		assertEquals(1, new MoreHalfNum(C).find());
	}
	
	@Test
	public void testFindD() {
		assertEquals(-1, new MoreHalfNum(D).find());
	}

}
