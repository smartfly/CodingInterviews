package chapter3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerCompute_11Test {

	@Test
	public void testCompute() {
		assertEquals(4.0, new PowerCompute_11().Compute(2.0, 2), 0.000001);;
	}
	
	@Test
	public void testCompute1() {
		assertEquals(4.0, new PowerCompute_11().Compute(2.0, -2), 0.000001);;
	}
	
	
	@Test
	public void testCompute2() {
		assertEquals(0.0, new PowerCompute_11().Compute(0.0, -2), 0.000001);;
	}
	
	@Test
	public void testCompute3() {
		assertEquals(4.0, new PowerCompute_11().Compute(-2.0, 2), 0.000001);;
	}


}
