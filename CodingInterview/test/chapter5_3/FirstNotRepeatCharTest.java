package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNotRepeatCharTest {

	@Test
	public void testGetFirstNotRepeatChar1() {
		assertEquals('0', new FirstNotRepeatChar().getFirstNotRepeatChar("ababccdeff"));
	}
	
	@Test
	public void testGetFirstNotRepeatChar() {
		assertEquals('b', new FirstNotRepeatChar().getFirstNotRepeatChar("abaccdeff"));
	}

}
