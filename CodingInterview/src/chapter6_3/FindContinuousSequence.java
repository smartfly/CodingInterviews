package chapter6_3;

/**
 * @author public
 *输入一个正数s,打印出所有和为s的连续正数数列(至少含有两个数)。
 *例如:输入15,由于1+2+3+4+5=4+5+6=7+8=15,所以结果打印出3个连续序列1~5、4~6、7~8
 */
public class FindContinuousSequence {

	public void FindContinuousSequenceSum(int sum){
		
		if (sum < 3) {//至少含有两个数
			return;
		}
		
		int smallIndex = 1;
		int bigIndex = 2;
		int mid = (sum + 1) >> 1;
		int ConSum = smallIndex + bigIndex;
		
		while (smallIndex < mid) {
			
			if (ConSum == sum) {
				PrintContinuousSequence(smallIndex, bigIndex);				
			}
			
			while (ConSum > sum) {
				ConSum -= smallIndex;
				smallIndex++;
				
				if (ConSum == sum) {
					PrintContinuousSequence(smallIndex, bigIndex);
				}
			}
			
			bigIndex++;
			ConSum += bigIndex;
						
		}
		System.out.println();
	}

	private void PrintContinuousSequence(int smallIndex, int bigIndex) {
		// TODO Auto-generated method stub
		System.out.println(smallIndex+"~"+bigIndex);
	}
	
}
