package chapter2_4;

/**
 * @author public
 *Merge Sort
 *2015-5-18
 */
public class MergeSort {
	
	public static int[] A;
	public int startIndex;
	public int endIndex;
	
	public int[] getSort(int[] A) {
		// TODO Auto-generated constructor stub
		MergeSort.A = A;
		sort(0, A.length-1);
		return A;
	}

	private void sort(int startIndex, int endIndex){
		if (startIndex < endIndex) {
			int mid = (startIndex + endIndex)/2;			
			sort(startIndex, mid);//left
			sort(mid+1, endIndex);//right
			Merge(startIndex, endIndex, mid);//combine			
		}			
	}

	private void Merge(int startIndex, int endIndex, int mid) {
		// TODO Auto-generated method stub
		int[] tmp = new int[endIndex-startIndex+1];
		int tmpIndex = 0;
		
		int leftIndex = startIndex;//left array
		int rightIndex = mid + 1;//right array
		
		//combine left array and right array
		while (leftIndex <= mid && rightIndex <= endIndex) {
			if (A[leftIndex] < A[rightIndex]) {
				tmp[tmpIndex++] = A[leftIndex++];
			}else {
				tmp[tmpIndex++] = A[rightIndex++];
			}
		}
		
		while (leftIndex <= mid) {
			tmp[tmpIndex++] = A[leftIndex++];
		}
		
		while (rightIndex <= endIndex) {
			tmp[tmpIndex++] = A[rightIndex++];
		}
		
		for (int i = 0; i < tmp.length; i++) {
			A[i+startIndex] = tmp[i];
		}
		
	}
	
}
