package chapter6_4;

import java.util.Arrays;

/**
 * @author public
 *从扑克牌中随机抽5张牌，判断是不是一个顺子,即这5张牌是不是连续的。2~10为数字本身,A为1,J为11,Q为12,K为13,而大、小王可以看成任意数字
 */
public class ContinuousInPlayCard {
	
	boolean find = false;
	
	public boolean IsContinuous(int[] A){
		
		if (A == null || A.length == 0) {
			return find;
		}
		
		Arrays.sort(A);//归并排序
		
		int numberOfZero = 0;
		int numberOfGap = 0;
		//统计数组中0的个数
		for (int i = 0; i < A.length && A[i] == 0; i++) {
			numberOfZero++;
		}
		//统计数组中间隔数目
		for (int i = numberOfZero+1; i < A.length; i++) {			
			if (A[i] == A[i-1]) {//遇到相同数字就不会连续
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
