package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeFibonacciValueByCycleTest {

	@Test
	public void testCompute() {
		assertEquals(55, new ComputeFibonacciValueByCycle().Compute(10));
	}
	
	@Test
	public void testCompute1() {
		assertEquals(1556111435, new ComputeFibonacciValueByCycle().Compute(1000));
	}

	@Test
	public void testCompute2() {
		assertEquals(1, new ComputeFibonacciValueByCycle().Compute(1));
	}
	
}
