package chapter4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintMatrixClockwiseTest {

	int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	int[] C = {1};
	
	@Test
	public void testMatrixClockwiseA() {//数组有多行多列
		new PrintMatrixClockwise().MatrixClockwise(A, 4, 4);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseB() {//数组有多行多列
		new PrintMatrixClockwise().MatrixClockwise(B, 4, 3);
		System.out.println();
	}

	@Test
	public void testMatrixClockwiseB1() {//数组只有一行
		new PrintMatrixClockwise().MatrixClockwise(B, 1, 12);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseB2() {//数组只有一列
		new PrintMatrixClockwise().MatrixClockwise(B, 12, 1);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseC() {//数组中只有一行一列
		new PrintMatrixClockwise().MatrixClockwise(C, 1, 1);
		System.out.println();
	}
	
}
