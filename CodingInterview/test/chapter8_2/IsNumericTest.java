package chapter8_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsNumericTest {

	@Test
	public void testStrIsNumeric() {
		assertEquals(true, new IsNumeric().StrIsNumeric("-123"));
	}
	
	@Test
	public void testStrIsNumeric1() {
		assertEquals(true, new IsNumeric().StrIsNumeric("-12.3"));
	}
	
	@Test
	public void testStrIsNumeric2() {
		assertEquals(true, new IsNumeric().StrIsNumeric("-12E+3"));
	}
	
	@Test
	public void testStrIsNumeric3() {
		assertEquals(false, new IsNumeric().StrIsNumeric("-12E+"));
	}
	
	@Test
	public void testStrIsNumeric4() {
		assertEquals(false, new IsNumeric().StrIsNumeric("-+5"));
	}
	
	@Test
	public void testStrIsNumeric5() {
		assertEquals(false, new IsNumeric().StrIsNumeric("1.2.3"));
	}
	
	@Test
	public void testStrIsNumeric6() {
		assertEquals(false, new IsNumeric().StrIsNumeric("12e+5.4"));
	}

}
