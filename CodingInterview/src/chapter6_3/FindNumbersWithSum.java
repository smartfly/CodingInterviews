package chapter6_3;

/**
 * @author public
 *����һ����������������һ������s,�������в�����������ʹ�����ǵĺ�������s.����ж�����ֵĺ͵���s,�������һ�Լ���
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
