package chapter5_2;

/**
 * @author public
 *��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬Ҳ����˵�����ִ����������������ֳ��ִ����ĺͻ�Ҫ��
 *����㷨����Ҫ�޸�ԭʼ����
 */
public class MoreHalfNumByArray {

	public int find(int[] A){		
		
		if (A == null || A.length == 0) {
			return -1;
		}
		
		int result = A[0];
		int times = 1;
		for (int i = 1; i < A.length; i++) {
			
			if (times == 0) {
				times = 1;
				result = A[i-1];
			}
			
			if (A[i] == result) {
				times++;
			}else {
				times--;
			}
		}
		
		if (times > 0) {
			return result;
		}
		
		return -1;
		
	}
	
}
