package chapter4_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void testnull() {
		new Permutation().printAllPermutation(null);
	}
	
	@Test
	public void testblank() {
		new Permutation().printAllPermutation("");
	}
	
	@Test
	public void testabc() {
		new Permutation().printAllPermutation("abc");
	}

}
