package chapter5_2;

public class NumberOfBetween1AndNByCommon {

	public int getNumber(int n){
		int number = 0;
		for (int i = 1; i <= n; i++) {
			number += NumberOf1(i);
		}		
		return number;
		
	}

	private int NumberOf1(int i) {
		// TODO Auto-generated method stub
		int number = 0;
		while (i > 0) {
			if (i % 10 == 1) {
				number++;
			}
			i = i/10;
		}
		
		return number;
	}
	
}
