package chapter6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContinuousInPlayCardTest {

	int[] A = {0, 1, 3, 4, 5};
	
	int[] B = {0, 1, 1, 2, 3};
	
	@Test
	public void testIsContinuousA() {
		assertEquals(true, new ContinuousInPlayCard().IsContinuous(A));;
	}
	
	@Test
	public void testIsContinuousB() {
		assertEquals(false, new ContinuousInPlayCard().IsContinuous(B));;
	}

}
