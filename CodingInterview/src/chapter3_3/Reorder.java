package chapter3_3;

public class Reorder {

	public int[] modify(int[] A, Operation operation) {
		
		if (A == null || A.length == 0) {
			return A;
		}
		
		int preIndex = 0;
		int lastIndex = A.length-1;
		
		while (preIndex < lastIndex) {
			
			while (preIndex < lastIndex && !operation.getResult(A[preIndex])) {
				preIndex++;
			}
			
			while (preIndex < lastIndex && operation.getResult(A[lastIndex])) {
				lastIndex--;
			}
			
			if (preIndex < lastIndex) {
				//exchange
				int tmp = A[preIndex];
				A[preIndex] = A[lastIndex];
				A[lastIndex] = tmp;
			}
			
		}
		
		return A;
		
	}
	
}
