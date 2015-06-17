package chapter6_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddByBitOperatorTest {

	@Test
	public void testAdd() {
		assertEquals(12, new AddByBitOperator().add(5, 7));;
	}

}
