package chapter2_3;

public class MergeTwoArray {
	
	int[] C;
	
	public int[] Merge(int[] A, int[] B) {
		
		if (A == null) {
			return B;
		}
		
		if (B == null) {
			return A;
		}
		
		int lengthA = A.length;
		int lengthB = B.length;
		int length = A.length + B.length;
		
		C = new int[length];		
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}
		
		int indexB = 0;
		int indexC = lengthA-1;
		while (indexB < lengthB) {
			
			for (int i = indexC; i >= 0; i--) {
				if (C[i] > B[indexB]) {
					C[i+1] = C[i];
				}else {
					C[i+1] = B[indexB];
					indexC++;
					break;
				}
			}
			indexB++;
		}
		
		return C;
		
	}
}
