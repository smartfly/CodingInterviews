package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class InversePairsByRecursiveTest {

	int[] A = {7, 5, 6, 4};
	
	int[] B = {4, 5, 6, 7};
	
	int[] C = {7, 6, 5, 4};
	
	int[] D = {7, 5, 5, 4};
	
	int[] E = {1};
	
	@Test
	public void testGetInversePairsNumberA() {
		assertEquals(5, new InversePairsByRecursive().getInversePairsNumber(A));;
	}
	
	@Test
	public void testGetInversePairsNumberB() {
		assertEquals(0, new InversePairsByRecursive().getInversePairsNumber(B));;
	}
	
	@Test
	public void testGetInversePairsNumberC() {
		assertEquals(6, new InversePairsByRecursive().getInversePairsNumber(C));;
	}
	
	@Test
	public void testGetInversePairsNumberD() {
		assertEquals(5, new InversePairsByRecursive().getInversePairsNumber(D));;
	}
	
	@Test
	public void testGetInversePairsNumberE() {
		assertEquals(0, new InversePairsByRecursive().getInversePairsNumber(E));;
	}

}
