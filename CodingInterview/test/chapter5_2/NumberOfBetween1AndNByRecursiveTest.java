package chapter5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfBetween1AndNByRecursiveTest {

	@Test
	public void testGetNumber1() {
		assertEquals(18821, new NumberOfBetween1AndNByRecursive().getNumber1(21345));
	}

}
