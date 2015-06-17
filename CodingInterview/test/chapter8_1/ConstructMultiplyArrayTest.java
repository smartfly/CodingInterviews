package chapter8_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructMultiplyArrayTest {

	int[] A = {1, 2, 3, 4, 5};	
	int[] B = {120, 60, 40, 30, 24};
	
	int[] A1 = {2, 8, 4, 7};
	int[] B1 = {224, 56, 112, 64};
	
	int[] A2 = {3};
	int[] B2 = {3};
	
	@Test
	public void testMultiplyA() {
		assertArrayEquals(B, new ConstructMultiplyArray().Multiply(A));;
	}
	
	@Test
	public void testMultiplyA1() {
		assertArrayEquals(B1, new ConstructMultiplyArray().Multiply(A1));;
	}
	
	@Test
	public void testMultiplyA2() {
		assertArrayEquals(B2, new ConstructMultiplyArray().Multiply(A2));;
	}

}
