package chapter8_1;

/**
 * @author public
 * 问题描述：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 		请找出数组中任意一个重复的数字。
 * 例如：如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3},那么对应的输出时重复的数字2或者3
 */
public class DuplicateArray {
	
	int Duplicate = -1;
	
	public boolean getDuplicate(int[] A){		
		//验证输入数字的合法性
		if (A == null || A.length == 0) {
			return false;
		}		
		int length = A.length;		
		for (int i = 0; i < length; i++) {
			if (A[i] < 0 || A[i] > length-1) {
				return false;
			}
		}
		
		for (int i = 0; i < length; i++) {
			//如果找不到A[i]=i的情况下，肯定有重复的值存在
			while (A[i] != i) {
				if (A[i] == A[A[i]]) {
					Duplicate = A[i];
					return true;
				}
				//exchange A[i] and A[A[i]]
				int tmp = A[A[i]];
				A[A[i]] = A[i];
				A[i] = tmp;				
			}
		}		
		
		return false;		
	}
	
}
