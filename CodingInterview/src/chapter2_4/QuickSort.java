package chapter2_4;

/**
 * @author public
 *quick sort
 *2015-5-17
 */
public class QuickSort {

	public int[] sort(int[] A, int startIndex, int endIndex){
		
		if (startIndex < endIndex) {
			int p = Partion(A, startIndex, endIndex);
			sort(A, startIndex, p-1);
			sort(A, p+1, endIndex);
		}
		return A;
	}

	private int Partion(int[] a, int startIndex, int endIndex) {
		
		//select the povit
		int pivot = a[endIndex];
		
		//find povit of index after order
		int j = startIndex;
		int i = startIndex-1;
		
		while (j < endIndex) {
			if (a[j] <= pivot) {
				i++;
				//exchange a[i] and a[j]
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;				
			}
			j++;
		}
		
		//exchange a[i+1] and a[endIndex]
		int temp = a[i+1];
		a[i+1] = pivot;
		a[endIndex] = temp;
		
		return i+1;
	}
	
}
