package chapter2_4;

public class FindMinInRotationArray {

	public int FindMinValue(int[] A) {
		// TODO Auto-generated method stub
		if (A == null) {
			return -1;
		}
		int startIndex = 0;
		int endIndex = A.length-1;
		int midIndex = startIndex;
		
		while (A[startIndex] >= A[endIndex]) {
			
			if (endIndex-startIndex == 1) {
				midIndex = endIndex;
				break;
			}
			
			midIndex = (startIndex+endIndex)/2;
			//如果下标为startIndex、endIndex和midIndex指向的三个数字相等，则只能顺序查找
			if (A[midIndex] == A[startIndex] && 
					A[midIndex] == A[endIndex]) {
				return OrderMin(A, startIndex, endIndex);
			}
			
			if (A[midIndex] >= A[startIndex]) {//Min value at right
				startIndex = midIndex;
			}else if (A[midIndex] <= A[endIndex]) {//Min value at left
				endIndex = midIndex;
			}		
			
		}
		
		return A[midIndex];
	}

	/**
	 * @param a
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * 顺序查找
	 */
	private int OrderMin(int[] a, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int key = a[startIndex];
		for (int i = 1; i <= endIndex; i++) {
			if (a[i] < key) {
				key = a[i];
			}
		}
		return key;
	}
	
}
