package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeftRotateStringTest {

	@Test
	public void testGetLeftRotateStr() {
		assertEquals("cdefgab", new LeftRotateString().getLeftRotateStr("abcdefg", 2));;
	}
	
	@Test
	public void testGetLeftRotateStr1() {
		assertEquals("abcdefg", new LeftRotateString().getLeftRotateStr("abcdefg", 0));;
	}
	
	@Test
	public void testGetLeftRotateStr2() {
		assertEquals("abcdefg", new LeftRotateString().getLeftRotateStr("abcdefg", 7));;
	}

}
