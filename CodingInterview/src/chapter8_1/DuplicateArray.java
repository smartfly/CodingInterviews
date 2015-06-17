package chapter8_1;

/**
 * @author public
 * ������������һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ�
 * 		���ҳ�����������һ���ظ������֡�
 * ���磺������볤��Ϊ7������{2, 3, 1, 0, 2, 5, 3},��ô��Ӧ�����ʱ�ظ�������2����3
 */
public class DuplicateArray {
	
	int Duplicate = -1;
	
	public boolean getDuplicate(int[] A){		
		//��֤�������ֵĺϷ���
		if (A == null || A.length == 0) {
			return false;
		}		
		int length = A.length;		
		for (int i = 0; i < length; i++) {
			if (A[i] < 0 || A[i] > length-1) {
				return false;
			}
		}
		
		for (int i = 0; i < length; i++) {
			//����Ҳ���A[i]=i������£��϶����ظ���ֵ����
			while (A[i] != i) {
				if (A[i] == A[A[i]]) {
					Duplicate = A[i];
					return true;
				}
				//exchange A[i] and A[A[i]]
				int tmp = A[A[i]];
				A[A[i]] = A[i];
				A[i] = tmp;				
			}
		}		
		
		return false;		
	}
	
}
