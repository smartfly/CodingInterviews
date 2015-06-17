package chapter5_2;

/**
 * @author public
 *数组中有一个数字出现的次数超过数组长度的一半，也就是说他出现次数比其他所有数字出现次数的和还要多
 *这个算法不需要修改原始数组
 */
public class MoreHalfNumByArray {

	public int find(int[] A){		
		
		if (A == null || A.length == 0) {
			return -1;
		}
		
		int result = A[0];
		int times = 1;
		for (int i = 1; i < A.length; i++) {
			
			if (times == 0) {
				times = 1;
				result = A[i-1];
			}
			
			if (A[i] == result) {
				times++;
			}else {
				times--;
			}
		}
		
		if (times > 0) {
			return result;
		}
		
		return -1;
		
	}
	
}
