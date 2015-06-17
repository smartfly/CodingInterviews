package chapter2_4;

/**
 * @author public
 *bubble sort
 *2015-5-18
 */
public class BubbleSort {

	public int[] sort(int[] A) {
		int index = A.length-1;
		while (index > 0) {
			for (int i = 1; i <= index; i++) {
				if (A[i-1] > A[i]) {
					int tmp = A[i-1];
					A[i-1] = A[i];
					A[i] = tmp;
				}
			}
			index--;
		}
		return A;
	}
	
}
