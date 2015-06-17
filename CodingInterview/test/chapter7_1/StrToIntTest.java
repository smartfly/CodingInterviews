package chapter7_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrToIntTest {

	@Test
	public void testGetInt1() {
		assertEquals(123, new StrToInt().getInt("+123"));
	}
	
	@Test
	public void testGetInt2() {
		assertEquals(-123, new StrToInt().getInt("-123"));
	}
	
	@Test
	public void testGetInt3() {
		assertEquals(-1, new StrToInt().getInt("-12d3"));//invalid input
	}
	
	@Test
	public void testGetInt4() {
		assertEquals(-1, new StrToInt().getInt("-12 3"));//invalid input
	}
	
	@Test
	public void testGetInt5() {
		assertEquals(-1, new StrToInt().getInt("-2147483649"));// input
	}
	
	@Test
	public void testGetInt6() {
		assertEquals(-1, new StrToInt().getInt(""));//invalid input
	}
	
	@Test
	public void testGetInt7() {
		assertEquals(-1, new StrToInt().getInt(" "));//invalid input
	}

}
