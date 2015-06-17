package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindNumberAppearOnceTest {

	int[] A = {2, 4, 3, 6, 3, 2, 5, 5};
	int[] B = {2, 4};
	int[] C = {2, 2, 4, 4};
	
	@Test
	public void testGetNumberAppearOnceA() {
		new FindNumberAppearOnce().getNumberAppearOnce(A);;
	}
	
	@Test
	public void testGetNumberAppearOnceB() {
		new FindNumberAppearOnce().getNumberAppearOnce(B);
	}

	@Test
	public void testGetNumberAppearOnceC() {
		new FindNumberAppearOnce().getNumberAppearOnce(C);
	}
	
}
