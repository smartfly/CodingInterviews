package chapter8_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateArrayTest {

	int[] A = {2, 3, 1, 0, 2, 5, 3};
	
	int[] B = {2, 3, 1, 0, 4, 6, 5};
	
	int[] C = {2, 3, 1, 0, 7, 5, 6};
	
	@Test
	public void testGetDuplicateA() {
		assertEquals(true, new DuplicateArray().getDuplicate(A));;
	}
	
	@Test
	public void testGetDuplicateB() {
		assertEquals(false, new DuplicateArray().getDuplicate(B));;
	}
	
	@Test
	public void testGetDuplicateC() {
		assertEquals(false, new DuplicateArray().getDuplicate(B));;
	}

}
