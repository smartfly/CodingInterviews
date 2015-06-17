package chapter8_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegularExpressTest {

	@Test
	public void testMatch() {
		assertEquals(true, new RegularExpress().match("aaa", "a.a"));;
	}
	
	@Test
	public void testMatch1() {
		assertEquals(true, new RegularExpress().match("aaa", "a*a"));;
	}
	
	@Test
	public void testMatch2() {
		assertEquals(false, new RegularExpress().match("aaa", "aaa.a"));;
	}
	
	@Test
	public void testMatch3() {
		assertEquals(true, new RegularExpress().match("aa", "aab*"));;
	}
	
	@Test
	public void testMatch4() {
		assertEquals(true, new RegularExpress().match("aa", "ab*ac*"));;
	}
	
	@Test
	public void testMatch5() {
		assertEquals(false, new RegularExpress().match("aa", "ab*"));;
	}

}
