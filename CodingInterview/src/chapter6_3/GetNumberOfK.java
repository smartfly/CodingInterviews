package chapter6_3;

/**
 * @author public
 *ͳ��һ�����������������г��ֵĴ���������������������{1,2,3,3,3,3,4,5}������3
 *����3����������г�����4�Σ�������4
 */
public class GetNumberOfK {

	public int getNumberOfK(int[] A, int k){
		int number = 0;
		
		if (A == null || A.length == 0) {
			return number;
		}
		
		int firstIndex = GetFirstK(A, k, 0, A.length-1);
		int lastIndex = GetLastK(A, k, 0, A.length-1);
		if (firstIndex > -1 && lastIndex > -1) {
			number = lastIndex - firstIndex + 1;
		}
		return number;
	}

	private int GetLastK(int[] a, int k, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		if (startIndex > endIndex) {
			return -1;
		}
		int mid = (startIndex+endIndex)>>1;
		if (a[mid] == k) {
			if (mid == a.length-1 || ((mid < a.length -1) && a[mid+1] > k)) {
				return mid;
			}else {
				startIndex = mid+1;
			}
		}else if (a[mid] > k) {
			endIndex = mid - 1;
		}else {
			startIndex = mid + 1;
		}
		
		return GetLastK(a, k, startIndex, endIndex);
	}

	private int GetFirstK(int[] a, int k, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		
		if (startIndex > endIndex) {
			return -1;
		}
		
		int mid = (startIndex+endIndex)>>1;		
		if (a[mid] == k) {
			if ((mid > 0 && a[mid-1]<k) || mid == 0) {
				return mid;
			}else {
				endIndex = mid - 1;
			}
		}else if (a[mid] > k) {
			endIndex = mid - 1;
		}else {
			startIndex = mid + 1;
		}
				
		return GetFirstK(a, k, startIndex, endIndex);
	}
	
}
