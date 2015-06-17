package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseSentenceTest {

	@Test
	public void testGetReserveSentence() {
		assertEquals("student. a am I", new ReverseSentence().getReserveSentence("I am a student."));;
	}
	
	@Test
	public void testGetReserveSentence1() {
		assertEquals("  ", new ReverseSentence().getReserveSentence("  "));;
	}
	
	@Test
	public void testGetReserveSentence2() {
		assertEquals("I", new ReverseSentence().getReserveSentence("I"));;
	}

}
