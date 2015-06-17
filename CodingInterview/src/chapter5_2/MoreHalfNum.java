package chapter5_2;

import java.util.Random;

/**
 * @author public
 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 *本程序基于Partition函数实现的，但是要修改输入数组
 */
public class MoreHalfNum {
	
	int[] A;
	
	
	public MoreHalfNum(int[] A) {
		// TODO Auto-generated constructor stub
		this.A = A;
	}
	
	public int find(){
		
		if (A == null || A.length == 0) {
			return -1;
		}		
		
		int start = 0;
		int end = A.length-1;
		int middle = A.length >> 1;
		
		int index = Partition(start, end);			
		while (index != middle) {				
			if (index > middle) {
				index = Partition(start, index-1);
			}else if (index < middle) {
				index = Partition(index+1, end);
			}
		}
		
		if (!CheckMoreThanHalf(A[index])) {
			return -1;
		}

		return A[index];
		
	}

	/**
	 * @param number
	 * @return
	 * 检查数组里面是否有大于一半
	 */
	private boolean CheckMoreThanHalf(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == number) {
				count++;
			}
		}
		
		if (count*2 > A.length) {
			return true;
		}
		
		return false;
	}

	private int Partition(int start, int end) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int tmpIndex = random.nextInt(end-start+1)+start;
		
		//exchange A[tmpIndex] and A[end]
		int tmp = A[tmpIndex];
		A[tmpIndex] = A[end];
		A[end] = tmp;
		//select pivot value
		int pivot = A[end];
				
		int i = start-1;
		int j = start;
		
		while (j < end) {
			
			if (A[j] < pivot) {
				i++;				
				//exchange A[i] and A[j]
				int tmp1 = A[i];
				A[i] = A[j];
				A[j] = tmp1;
				
			}
			j++;
		}
		//exchange A[i+1] and A[end]
		int tmp1 = A[i+1];
		A[i+1] = A[end];
		A[end] = tmp1;
		
		return i+1;
	}
	
}
