package chapter5_2;

import java.util.Random;

public class GetLeastNumbersByPartition {

	int[] A;
	int number;
	
	public GetLeastNumbersByPartition(int[] A, int number) {
		// TODO Auto-generated constructor stub
		this.A = A;
		this.number = number;
	}
	
	public int[] get(){
		
		if (A == null || A.length == 0 || number <= 0) {
			return A;
		}
		
		int start = 0;
		int end = A.length-1;
		
		int index = Partition(start, end);
		while (index != number) {
			if (index > number) {
				index = Partition(start, index-1);
			}else {
				index = Partition(index+1, end);
			}
		}
		
		int[] B =new int[number];
		System.arraycopy(A, 0, B, 0, number);
		return B;
		
	}

	private int Partition(int start, int end) {
		// select pivot element
		Random random = new Random();
		int index = random.nextInt(end-start+1)+start;
		
		int pivot = A[index];
		A[index] = A[end];
		A[end] = pivot;
		
		int j = start;
		int i = start-1 ;
		while (j < end) {
			if (A[j] < pivot) {
				i++;
				//exchange A[i] and A[j]
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
			j++;
		}
		//exchange A[i+1] and A[end]
		int tmp = A[i+1];
		A[i+1] = A[end];
		A[end] = tmp;
		
		return i+1;
	}
	
}
