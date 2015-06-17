package chapter6_3;

public class FindNumberAppearOnce {
	
	public void getNumberAppearOnce(int[] A){
		
		if (A == null || A.length == 0) {
			return;
		}
		
		int resultExclusive = 0;
		
		for (int i = 0; i < A.length; i++) {
			resultExclusive ^= A[i];
		}
		
		int firstIndexOf1 = FoundFirstBit1(resultExclusive);
		
		int num1 = 0;		
		int num2 = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (IsBit1(A[i], firstIndexOf1)) {
				num1 ^= A[i];
			}else {
				num2 ^= A[i];
			}
		}
		
		System.out.println(num1+" "+num2);
		
	}

	private boolean IsBit1(int num, int firstIndexOf1) {
		// TODO Auto-generated method stub
		num = num >> firstIndexOf1;		
		return (num & 0x1) == 0;
	}

	private int FoundFirstBit1(int resultExclusive) {
		// TODO Auto-generated method stub
		int index = 0;
		int result = resultExclusive & 0x1;
		while (result == 0 && index < 32) {
			index++;
			result =(resultExclusive >> 1) & 0x1;
		}
		
		return index;
	}
	
}
