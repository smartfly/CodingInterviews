package chapter6_3;

/**
 * @author public
 *输入一个递增排序的数组和一个数字s,在数组中查找两个数，使得他们的和正好是s.如果有多对数字的和等于s,输出任意一对即可
 */
public class FindNumbersWithSum {

	public boolean findNumbers(int[] A, int sum){
		boolean find = false;
				
		if (A != null && A.length != 0) {
			
			int startIndex = 0;			
			int endIndex = A.length-1;
			
			while (startIndex < endIndex) {
				int total = A[startIndex] + A[endIndex];
				if (total == sum) {
					System.out.println(A[startIndex]+" "+A[endIndex]);
					find = true;
					break;
				}else if (total > sum) {
					endIndex--;
				}else {
					startIndex++;
				}
			}
			
		}	
		return find;
		
	}
	
}
