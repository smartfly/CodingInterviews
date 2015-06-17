package chapter2_4;

/**
 * @author public
 *insertion sort
 *2015-5-17
 */
public class InsertionSort {

	public int[] sort(int[] A){
		
		for (int i = 1; i < A.length; i++) {			
			int key = A[i];
			int j = i-1;
			while (j >= 0 && (key < A[j])) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;					
		}
		return A;
	}
	
}
