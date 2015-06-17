package chapter5_3;

/**
 * @author public
 *创建数组保存已经找到的丑数，用空间换时间的解法
 */
public class UglyNumberByArray {

	public int UglyNumber(int index){
		
		if (index <= 0) {
			return 0;
		}
		
		int[] UglyNumberArray = new int[index];
		
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		
		UglyNumberArray[0] = 1;
		
		for (int i = 1; i < UglyNumberArray.length; i++) {
			
			UglyNumberArray[i] = Min(UglyNumberArray[index2]*2, 
					UglyNumberArray[index3]*3,UglyNumberArray[index5]*5);
			
			while(UglyNumberArray[index2]*2 <= UglyNumberArray[i]) {
				index2++;
			}
			
			while(UglyNumberArray[index3]*3 <= UglyNumberArray[i]) {
				index3++;
			}
			
			while(UglyNumberArray[index5]*5 <= UglyNumberArray[i]) {
				index5++;
			}
			
		}
		
		return UglyNumberArray[index-1];
	}

	private int Min(int i, int j, int k) {
		// TODO Auto-generated method stub
		int min = (i<j) ? i:j;		
		min = (min<k) ? min:k;
		
		return min;
	}
	
}
