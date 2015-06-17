package chapter2_4;

/**
 * @author public
 *Shell Sort
 *2015-5-18
 */
public class ShellSort {

	private static int[] A;
	
	public int[] getSort(int[] A){		
		ShellSort.A = A;
		sort(A.length);
		return A;		
	}

	private void sort(int length) {
		// TODO Auto-generated method stub
		int interval = length/2;
		while (interval >= 1 ) {
			for (int i = 0; i < length; i+=interval) {
				int j = i-interval;
				int key = A[i];
				while (j >= 0 && A[j] > key) {
					A[j+interval] = A[j];
					j = j-interval;
				}
				A[j+interval] = key;
			}
			interval = interval/2;
		}
		
		
	}
	
}
