package chapter5_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberByCommonTest {

	@Test
	public void testGetUglyNumber() {
		assertEquals(859963392, new UglyNumberByCommon().getUglyNumber(1500));;
	}

}
