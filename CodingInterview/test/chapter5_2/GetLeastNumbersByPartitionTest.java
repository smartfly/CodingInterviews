package chapter5_2;

import org.junit.Test;

public class GetLeastNumbersByPartitionTest {

	int[] A = {4, 5, 1, 6, 2, 7, 3, 8};
	
	int[] B = {3, 4, 3, 7, 3, 8, 4, 9};
	
	@Test
	public void testGetA() {
		int[] C = new GetLeastNumbersByPartition(A, 4).get();
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		System.out.println();
	}
	
	@Test
	public void testGetB() {
		int[] C = new GetLeastNumbersByPartition(B, 4).get();
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]+" ");
		}
		System.out.println();
	}

}
