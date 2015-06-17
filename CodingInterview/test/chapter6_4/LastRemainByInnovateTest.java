package chapter6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastRemainByInnovateTest {

	@Test
	public void testGetLastRemainNumber() {
		assertEquals(1027, new LastRemainByInnovate().getLastRemainNumber(4000, 997));;
	}

}
