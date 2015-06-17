package chapter5_3;

public class InversePairsByRecursive {

	int InversePairsNumber = 0;
	int[] SortA;
	
	public int getInversePairsNumber(int[] A){
		
		if (A == null || A.length == 0) {
			return InversePairsNumber;
		}
		
		SortA = new int[A.length];
		
		int start = 0;
		int end = A.length-1;
		Merge(A, start, end);
		
		return InversePairsNumber;
		
	}

	private void Merge(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if (start == end) {
			return;
		}
		
		int mid = (start+end)>>1;
		Merge(a, start, mid);
		Merge(a, mid+1, end);
		
		int leftIndex = mid;
		int rightIndex = end;
		int Index = end;
		
		while (leftIndex >= start && rightIndex >= mid+1) {
			if (a[leftIndex] > a[rightIndex]) {
				InversePairsNumber += rightIndex-mid;
				SortA[Index--] = a[leftIndex--];
				
			}else {
				SortA[Index--] = a[rightIndex--];
			}
		}
		
		while (leftIndex >= start) {
			SortA[Index--] = a[leftIndex--];
		}
		
		while (rightIndex >= mid+1) {
			SortA[Index--] = a[rightIndex--];
		}
		
		for (int i = start; i <= end; i++) {
			a[i] = SortA[i];
		}
		
	}
	
}
