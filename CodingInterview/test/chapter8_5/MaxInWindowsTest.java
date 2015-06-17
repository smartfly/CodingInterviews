package chapter8_5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MaxInWindowsTest {

	ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 2, 6, 2, 5, 1));
	
	@Test
	public void testFindMaxInWindows() {
		ArrayList<Integer> result = new MaxInWindows().findMaxInWindows(input, 4);
		System.out.println(result);
	}

}
