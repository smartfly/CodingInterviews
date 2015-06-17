package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeFibonacciValueByRecursionTest {

	@Test
	public void testComputeValue() {
		assertEquals(55, new ComputeFibonacciValueByRecursion().ComputeValue(10));
	}
	
	@Test
	public void testComputeValue1() {
		long startTime = System.currentTimeMillis();
		assertEquals(0, new ComputeFibonacciValueByRecursion().ComputeValue(100));
		System.out.println(System.currentTimeMillis()-startTime);
	}

}
