package chapter8_1;

/**
 * @author public
 * ����һ������A[0,1,2,...,n-1],�빹��һ������B[0,1,2,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1].
 * ����ʹ�ó���.
 * C[i] = A[0]*A[1]*...*A[i-1] ==> C[i] = C[i-1]*A[i-1];
 * D[i] = A[i+1]*A[i+2]*...*A[n-1]; ==> D[i] = D[i+1]*A[i+1];
 * �������������鳤�ȴ���1,
 */
public class ConstructMultiplyArray {

	public int[] Multiply(int[] A) {
		// TODO Auto-generated method stub
		if (A == null || A.length <= 1) {
			return A;
		}
		
		int[] B = new int[A.length];		
		B[0] = 1; 
		for (int i = 1; i < A.length; i++) {
			B[i] = A[i-1]*B[i-1];
		}
		
		int tmp = 1;
		for (int i = A.length-2; i >= 0; i--) {
			tmp = tmp*A[i+1];
			B[i] = B[i]*tmp;
		}
		
		return B;
	}
	
}
