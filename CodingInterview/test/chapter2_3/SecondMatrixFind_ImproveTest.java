package chapter2_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondMatrixFind_ImproveTest {

	int[] a = {1, 2, 8, 9, 2, 4, 9, 12, 4, 7, 10, 13, 6, 8, 11, 15};
	
	@Test
	public void testFind() {
		assertEquals(false, new SencondMatrixFind().Find(a, 4, 4, 14));
	}
	
	@Test
	public void testFind1() {
		assertEquals(true, new SencondMatrixFind().Find(a, 4, 4, 1));
	}

	
	@Test
	public void testFind2() {
		assertEquals(false, new SencondMatrixFind().Find(a, 4, 4, 16));
	}
	
	@Test
	public void testFind3() {
		assertEquals(false, new SencondMatrixFind().Find(null, 4, 4, 16));
	}
	
}
