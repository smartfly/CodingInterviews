package chapter2_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SencondMatrixFindTest {

	int[] a = {1, 2, 8, 9, 2, 4, 9, 12, 4, 7, 10, 13, 6, 8, 11, 15};
	
	@Test
	public void testFind() {
		assertEquals(false, new SencondMatrixFind().Find(a, 4, 4, 14));
	}

}
