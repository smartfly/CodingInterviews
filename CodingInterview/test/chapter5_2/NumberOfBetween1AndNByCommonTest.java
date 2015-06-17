package chapter5_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfBetween1AndNByCommonTest {

	@Test
	public void testGetNumber() {
		assertEquals(18821, new NumberOfBetween1AndNByCommon().getNumber(21345));;
	}

}
