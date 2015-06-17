package chapter6_4;

import java.util.Arrays;

/**
 * @author public
 *���˿����������5���ƣ��ж��ǲ���һ��˳��,����5�����ǲ��������ġ�2~10Ϊ���ֱ���,AΪ1,JΪ11,QΪ12,KΪ13,����С�����Կ�����������
 */
public class ContinuousInPlayCard {
	
	boolean find = false;
	
	public boolean IsContinuous(int[] A){
		
		if (A == null || A.length == 0) {
			return find;
		}
		
		Arrays.sort(A);//�鲢����
		
		int numberOfZero = 0;
		int numberOfGap = 0;
		//ͳ��������0�ĸ���
		for (int i = 0; i < A.length && A[i] == 0; i++) {
			numberOfZero++;
		}
		//ͳ�������м����Ŀ
		for (int i = numberOfZero+1; i < A.length; i++) {			
			if (A[i] == A[i-1]) {//������ͬ���־Ͳ�������
				find = false;
				return find;
			}
			
			numberOfGap += (A[i]-A[i-1]-1);
		}
		
		if (numberOfZero >= numberOfGap) {
			find = true;
		}else {
			find = false;
		}
		
		return find;
		
	}
	
}
