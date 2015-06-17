package chapter8_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovingCountTest {

	@Test
	public void testGetCount() {//threshold = rows || threshold = cols
		assertEquals(4, new MovingCount().getCount(2, 2, 2));;
	}
	
	@Test
	public void testGetCount1() {//threshold > rows || threshold > cols
		assertEquals(1, new MovingCount().getCount(2, 1, 1));;
	}
	
	@Test
	public void testGetCount2() {//threshold < rows || threshold < cols
		assertEquals(6, new MovingCount().getCount(2, 3, 3));;
	}
	
	@Test
	public void testGetCount3() {//invalid input
		assertEquals(0, new MovingCount().getCount(2, 0, 3));;
	}
	
	@Test
	public void testGetCount4() {//invalid input
		assertEquals(0, new MovingCount().getCount(2, 3, 0));;
	}
	
	@Test
	public void testGetCount5() {//invalid input
		assertEquals(0, new MovingCount().getCount(-1, 3, 3));;
	}

}
