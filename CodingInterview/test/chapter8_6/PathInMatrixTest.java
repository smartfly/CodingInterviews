package chapter8_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class PathInMatrixTest {

	char[] A = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
	
	char[] A1 = null;
	
	char[] A2 = {};
	
	@Test
	public void testHasPath() {//has the path
		assertEquals(true, new PathInMatrix().hasPath(A, 3, 4, "bcced"));
	}
	
	@Test
	public void testHasPath1() {//has no path
		assertEquals(false, new PathInMatrix().hasPath(A, 3, 4, "abcb"));
	}
	
	@Test
	public void testHasPath2() {//invalid input
		assertEquals(false, new PathInMatrix().hasPath(A1, 3, 4, "abcb"));
	}
	
	@Test
	public void testHasPath3() {//invalid input
		assertEquals(false, new PathInMatrix().hasPath(A2, 3, 4, "abcb"));
	}
	
	@Test
	public void testHasPath4() {//invalid input
		assertEquals(false, new PathInMatrix().hasPath(A, 0, 4, "abcb"));
	}
	
	@Test
	public void testHasPath5() {//invalid input
		assertEquals(false, new PathInMatrix().hasPath(A, 3, 0, "abcb"));
	}
	
	@Test
	public void testHasPath6() {//invalid input
		assertEquals(false, new PathInMatrix().hasPath(A, 3, 0, null));
	}
	
	@Test
	public void testHasPath7() {//invalid input
		assertEquals(true, new PathInMatrix().hasPath(A, 3, 4, ""));
	}
	
}
