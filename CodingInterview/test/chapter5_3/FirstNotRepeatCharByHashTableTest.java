package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNotRepeatCharByHashTableTest {

	@Test
	public void testFirstNotRepeatChar() {
		assertEquals('d', new FirstNotRepeatCharByHashTable().FirstNotRepeatChar("abbaccdeff"));;
	}
	
	@Test
	public void testFirstNotRepeatChar0() {
		assertEquals('0', new FirstNotRepeatCharByHashTable().FirstNotRepeatChar("ababccddeeff"));;
	}
	
	@Test
	public void testFirstNotRepeatCharnull() {
		assertEquals('0', new FirstNotRepeatCharByHashTable().FirstNotRepeatChar(null));;
	}
}
