package chapter5_3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindFirstCommonNodeTest {

	Integer[] a = {4, 5, 6, 7};	
	Integer[] b = {4, 5, 6, 7};	
	List<Integer> aList1 = new ArrayList<Integer>(Arrays.asList(a));
	List<Integer> aList2 = new ArrayList<Integer>(Arrays.asList(b));
	
	
	Integer[] a1 = {4, 5, 6, 7};	
	Integer[] b1 = {2, 3, 3, 7};	
	List<Integer> aListA1 = new ArrayList<Integer>(Arrays.asList(a1));
	List<Integer> aListA2 = new ArrayList<Integer>(Arrays.asList(b1));
	
	@Test
	public void testGetFirstCommonNode() {
		assertEquals(4, new FindFirstCommonNode().getFirstCommonNode(aList1, aList2));;
	}
	
	@Test
	public void testGetFirstCommonNodeA1() {
		assertEquals(7, new FindFirstCommonNode().getFirstCommonNode(aListA1, aListA2));;
	}

}
