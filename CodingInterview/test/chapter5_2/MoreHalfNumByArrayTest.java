package chapter5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoreHalfNumByArrayTest {
	
	int[] A = {1, 2, 3, 2, 2, 2, 5, 4, 2};
	
	int[] B = {1, 2, 2, 4, 2};
	
	int[] C = {1};
	
	int[] D = null;

	@Test
	public void testFindA() {
		assertEquals(2, new MoreHalfNumByArray().find(A));
	}
	
	@Test
	public void testFindB() {
		assertEquals(2, new MoreHalfNumByArray().find(B));
	}
	
	@Test
	public void testFindC() {
		assertEquals(1, new MoreHalfNumByArray().find(C));
	}
	
	@Test
	public void testFindD() {
		assertEquals(-1, new MoreHalfNumByArray().find(D));
	}

}
