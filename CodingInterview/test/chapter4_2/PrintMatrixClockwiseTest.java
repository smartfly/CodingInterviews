package chapter4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintMatrixClockwiseTest {

	int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	int[] C = {1};
	
	@Test
	public void testMatrixClockwiseA() {//�����ж��ж���
		new PrintMatrixClockwise().MatrixClockwise(A, 4, 4);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseB() {//�����ж��ж���
		new PrintMatrixClockwise().MatrixClockwise(B, 4, 3);
		System.out.println();
	}

	@Test
	public void testMatrixClockwiseB1() {//����ֻ��һ��
		new PrintMatrixClockwise().MatrixClockwise(B, 1, 12);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseB2() {//����ֻ��һ��
		new PrintMatrixClockwise().MatrixClockwise(B, 12, 1);
		System.out.println();
	}
	
	@Test
	public void testMatrixClockwiseC() {//������ֻ��һ��һ��
		new PrintMatrixClockwise().MatrixClockwise(C, 1, 1);
		System.out.println();
	}
	
}
