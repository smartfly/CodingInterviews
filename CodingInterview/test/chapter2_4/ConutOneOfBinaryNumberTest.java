package chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConutOneOfBinaryNumberTest {

	@Test
	public void testCount() {
		assertEquals(3, new CountOneOfBinaryNumber().count(11));//正数
	}

	@Test
	public void testCount1() {
		assertEquals(1, new CountOneOfBinaryNumber().count(0x80000000));//负数
	}
	
	@Test
	public void testCount2() {
		assertEquals(0, new CountOneOfBinaryNumber().count(0));//0
	}
	
}
