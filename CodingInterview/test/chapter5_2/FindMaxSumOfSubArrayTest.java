package chapter5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxSumOfSubArrayTest {

	int[] A = {1, -2, 3, 10, -4, 7, 2, -5};
	
	int[] B = {1, -2, 3, 10, -4, 7, 2, -5, 1, 7};
	
	int[] C = {-1};
	
	int[] D = null;
	
	@Test
	public void testFindMaxSumA() {
		assertEquals(18, new FindMaxSumOfSubArray().FindMaxSum(A));
	}
	
	@Test
	public void testFindMaxSumB() {
		assertEquals(21, new FindMaxSumOfSubArray().FindMaxSum(B));
	}
	
	@Test
	public void testFindMaxSumC() {
		assertEquals(-1, new FindMaxSumOfSubArray().FindMaxSum(C));
	}
	
	@Test
	public void testFindMaxSumD() {
		FindMaxSumOfSubArray fSubArray = new FindMaxSumOfSubArray();
		assertEquals(-1, fSubArray.FindMaxSum(D));
		assertEquals(true, fSubArray.InvalidInput);
	}
}
