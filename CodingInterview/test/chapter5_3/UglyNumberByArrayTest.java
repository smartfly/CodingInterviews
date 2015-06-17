package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberByArrayTest {

	
	@Test
	public void testUglyNumber0() {
		assertEquals(0, new UglyNumberByArray().UglyNumber(0));;
	}
	
	@Test
	public void testUglyNumber1() {
		assertEquals(1, new UglyNumberByArray().UglyNumber(1));;
	}
	
	@Test
	public void testUglyNumber5() {
		assertEquals(5, new UglyNumberByArray().UglyNumber(5));;
	}
	
	@Test
	public void testUglyNumber1500() {
		assertEquals(859963392, new UglyNumberByArray().UglyNumber(1500));;
	}

}
