package chapter8_1;

/**
 * @author public
 * 给定一个数组A[0,1,2,...,n-1],请构建一个数组B[0,1,2,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1].
 * 不能使用除法.
 * C[i] = A[0]*A[1]*...*A[i-1] ==> C[i] = C[i-1]*A[i-1];
 * D[i] = A[i+1]*A[i+2]*...*A[n-1]; ==> D[i] = D[i+1]*A[i+1];
 * 隐含条件：数组长度大于1,
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
