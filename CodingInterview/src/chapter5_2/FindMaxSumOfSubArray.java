package chapter5_2;

/**
 * @author public
 *���������������
 */
public class FindMaxSumOfSubArray {

	boolean InvalidInput = false;//������Ч��־λ
	
	public int FindMaxSum(int[] A){
		
		if (A == null || A.length == 0) {
			InvalidInput = true;
			return -1;
		}
		
		int Sum = A[0];
		int MaxSum = A[0];
		
		for (int i = 1; i < A.length; i++) {
			
			if (Sum < 0) {
				Sum = A[i];
			}else {
				Sum += A[i];				
			}
			
			if (Sum > MaxSum) {						
				MaxSum = Sum;
			}				
			
		}
		
		return MaxSum;
		
	}
	
}
