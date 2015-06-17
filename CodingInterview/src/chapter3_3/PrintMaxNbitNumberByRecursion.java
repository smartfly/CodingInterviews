package chapter3_3;

public class PrintMaxNbitNumberByRecursion {

	public void print(int n){
		
		if (n <= 0) {
			return;
		}
		
		char[] numbers = new char[n];		
		for (int i = 0; i < 10; i++) {
			numbers[0] = (char) (i + '0');
			PrintMaxRecursively(numbers, n, 0);
		}
	}

	private void PrintMaxRecursively(char[] numbers, int length, int index) {
		// TODO Auto-generated method stub
		if (index == length-1) {
			printNumber(numbers);
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			numbers[index+1] = (char) (i + '0');
			PrintMaxRecursively(numbers, length, index+1);
		}
		
	}
	
	/**
	 * @param chars
	 * 删除数字前面无效的0.
	 * 例如：将098变成98
	 */
	private void printNumber(char[] chars) {
		// TODO Auto-generated method stub
		boolean isBegin0 = true;
		
		for (int i = 0; i < chars.length; i++) {			
			if (isBegin0 && chars[i] != '0') {
				isBegin0 = false;
			}			
			if (!isBegin0) {
				System.out.print(chars[i]);
			}			
		}
		
		System.out.print("\t");
	}
	
}
