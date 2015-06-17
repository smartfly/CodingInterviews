package chapter8_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoundFirstAppearOnceCharTest {

	@Test
	public void testGetFirstAppearOnceChar() {
		assertEquals('g', new FoundFirstAppearOnceChar().getFirstAppearOnceChar("go"));;
	}
	
	@Test
	public void testGetFirstAppearOnceChar1() {
		assertEquals(' ', new FoundFirstAppearOnceChar().getFirstAppearOnceChar("goog"));;
	}
	
	@Test
	public void testGetFirstAppearOnceChar2() {
		assertEquals('l', new FoundFirstAppearOnceChar().getFirstAppearOnceChar("google"));;
	}

}
