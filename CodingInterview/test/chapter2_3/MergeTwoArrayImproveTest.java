package chapter2_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeTwoArrayImproveTest {

	int[] testA = {1, 4, 7};
	int[] testB = {8, 9, 10};
	int[] testC = {1, 4, 7, 8, 9, 10};
	
	int[] test1 = {1, 4, 7};
	int[] test2 = {2, 5, 8};
	int[] test3 = {1, 2, 4, 5, 7, 8};
	
	int[] testA1 = null;
	int[] testB1 = {8, 9, 10};
	int[] testC1 = {8, 9, 10};
	
	int[] testA2 = {};
	int[] testB2 = {8, 9, 10};
	int[] testC2 = {8, 9, 10};
	
	@Test
	public void testMergeABC() {
		assertArrayEquals(testC, new MergeTwoArrayImprove().Merge(testA, testB));
	}
	
	@Test
	public void testMerge123() {
		assertArrayEquals(test3, new MergeTwoArrayImprove().Merge(test1, test2));
	}
	
	@Test
	public void testMergeA1B1C1() {
		assertArrayEquals(testC2, new MergeTwoArrayImprove().Merge(testA2, testB2));
	}
	
	@Test
	public void testMergeA2B2C2() {
		assertArrayEquals(testC1, new MergeTwoArrayImprove().Merge(testA1, testB1));
	}

}
