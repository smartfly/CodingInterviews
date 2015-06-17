package chapter6_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindContinuousSequenceTest {

	@Test
	public void testFindContinuousSequenceSum15() {
		new FindContinuousSequence().FindContinuousSequenceSum(15);;
	}
	
	@Test
	public void testFindContinuousSequenceSum4() {
		new FindContinuousSequence().FindContinuousSequenceSum(4);;
	}
	
	@Test
	public void testFindContinuousSequenceSum100() {
		new FindContinuousSequence().FindContinuousSequenceSum(100);;
	}
	
	@Test
	public void testFindContinuousSequenceSum3() {
		new FindContinuousSequence().FindContinuousSequenceSum(3);;
	}

}
