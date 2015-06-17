package chapter3_3;

public class ReorderOddEvenImprove {
	
	public int[] modify(int[] A){
		
		if (A == null || A.length == 0) {
			return A;
		}
		
		int preIndex = 0;
		int afterIndex = A.length-1;
		
		while (preIndex < afterIndex) {
			//向后移动preIndex,直到它指向偶数
			while (preIndex < afterIndex && (A[preIndex] & 0x1) != 0) {
				preIndex++;
			}
			//向前移动afterIndex,直到指向奇数
			while (preIndex < afterIndex && (A[afterIndex] & 0x1) == 0) {
				afterIndex--;
			}
			
			if (preIndex < afterIndex) {
				//exchange A[preIndex] and A[afterIndex]
				int tmp = A[preIndex];
				A[preIndex] = A[afterIndex];
				A[afterIndex] = tmp;
			}
			
		}
		
		return A;
		
	}
	
}
