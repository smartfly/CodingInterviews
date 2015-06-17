package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetNumberOfKTest {

	int[] A = {1, 2, 3, 3, 3, 3, 4, 5};
	
	int[] B = {1, 2, 3, 3, 3, 3, 4, 5};
	
	int[] C = null;
	
	int[] D = {};
	
	@Test
	public void testGetNumberOf3() {
		assertEquals(4, new GetNumberOfK().getNumberOfK(A, 3));;
	}
	
	@Test
	public void testGetNumberOf2() {
		assertEquals(1, new GetNumberOfK().getNumberOfK(A, 5));;
	}
	
	@Test
	public void testGetNumberOf6() {
		assertEquals(0, new GetNumberOfK().getNumberOfK(A, 6));;
	}
	
	@Test
	public void testGetNumberOfC() {
		assertEquals(0, new GetNumberOfK().getNumberOfK(A, 6));;
	}
	
	@Test
	public void testGetNumberOfD() {
		assertEquals(0, new GetNumberOfK().getNumberOfK(A, 6));;
	}

}
