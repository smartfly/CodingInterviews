package chapter5_3;

/**
 * @author public
 *常规方法统计数组中的逆序对数
 */
public class InversePairsInArray {

	public int getInversePairs(int[] A){
		
		int InversePairsNumber = 0;
		
		if (A == null || A.length == 0) {
			return InversePairsNumber;
		}
		
		for (int i = 0; i < A.length; i++) {
			int j = i+1;
			while (j < A.length) {
				if (A[i] > A[j]) {
					InversePairsNumber++;
				}
				j++;
			}
		}
		
		return InversePairsNumber;
		
	}
	
}
