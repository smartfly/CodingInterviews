package chapter3_3;

public class ReorderOddEven {

	public int[] modify(int[] A){
		
		if (A == null || A.length == 0) {
			return A;
		}
		
		int startIndex = 0;
		int endIndex = A.length -1;
		
		while (endIndex > startIndex) {
			
			if (((A[startIndex]&0x1)==0) && ((A[endIndex]&0x01)==1)) {
				//exchange A[startIndex] and A[endIndex]
				int tmp = A[startIndex];
				A[startIndex] = A[endIndex];
				A[endIndex] = tmp;
				startIndex++;
				endIndex--;
			}
			
			if ((A[startIndex]&0x1)==1) {//��ǰΪ���������ơ���
				startIndex++;
			}
			
			if ((A[endIndex]&0x1)==0) {//��ǰΪż�������ơ���
				endIndex++;
			}
			
		}
		
		return A;
		
	}
	
}
