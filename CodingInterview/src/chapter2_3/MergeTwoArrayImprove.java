package chapter2_3;

public class MergeTwoArrayImprove {

	
	public int[] Merge(int[] A, int[] B){
		
		if (A == null) {
			return B;
		}
		
		if (B == null) {
			return A;
		}
		
		int lengthA = A.length;
		int lengthB = B.length;
		int lengthC = lengthA + lengthB;
		int[] C = new int[lengthC];
		
		int indexOfA = lengthA-1;
		int indexOfB = lengthB-1;
		int indexOfC = lengthC-1;
		
		while (indexOfC >= 0) {
			
			if (indexOfA<0) {
				for (int i = indexOfB; i >= 0; i--) {
					C[indexOfC--] = B[i];
				}
			}else if (indexOfB<0) {
				for (int i = indexOfA; i >= 0; i--) {
					C[indexOfC--] = A[i];
				}
			}else {
				if (A[indexOfA] >= B[indexOfB]) {
					C[indexOfC--] = A[indexOfA--];
				}else {
					C[indexOfC--] = B[indexOfB--];
				}
			}
			
		}
		
		return C;
	}
	
}
