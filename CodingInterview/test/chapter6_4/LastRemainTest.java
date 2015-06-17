package chapter6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastRemainTest {

	@Test
	public void testGetLastRemainNumA() {
		assertEquals(3, new LastRemain().getLastRemainNum(5, 3));;
	}
	
	@Test
	public void testGetLastRemainNumB() {
		assertEquals(1, new LastRemain().getLastRemainNum(2, 3));;
	}
	
	@Test
	public void testGetLastRemainNumC() {
		assertEquals(-1, new LastRemain().getLastRemainNum(0, 3));;
	}
	
	@Test
	public void testGetLastRemainNumD() {
		assertEquals(1027, new LastRemain().getLastRemainNum(4000, 997));;
	}

}
