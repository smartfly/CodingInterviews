package chapter5_2;

/**
 * @author public
 *连续子数组的最大和
 */
public class FindMaxSumOfSubArray {

	boolean InvalidInput = false;//输入无效标志位
	
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
