package chapter3_3;

/**
 * @author public
 *在字符串上模拟数字加法的解法：
 *1.在字符串表达的数字上模拟加法
 *2.把字符串表达式的数字打印出来
 */
public class PrintMaxNbitNumberByChar {

	public void print(int n){
		if (n <= 0) {
			return;
		}
		
		//init
		char[] chars = new char[n];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = '0';
		}
		
		while (!Increment(chars)) {
			printNumber(chars);
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
		
		System.out.println();
	}

	/**
	 * @param chars
	 * @return
	 * 加1操作
	 */
	private boolean Increment(char[] chars) {
		// TODO Auto-generated method stub
		boolean isOverflow = false;
		int nTakeOver = 0;
		int nLength = chars.length; 
		
		for (int i = nLength-1; i >= 0; i--) {
			
			int nSum = chars[i] - '0' +nTakeOver;
			
			if (i == nLength-1) {//末尾加1
				nSum++;
			}
			
			if (nSum >= 10) {
				if (i == 0) {
					isOverflow = true;
				}else {
					nSum -= 10;
					nTakeOver = 1;
					chars[i] = (char) (nSum + '0');
				}
			}else {
				chars[i] = (char) ('0' + nSum);
				break;
			}
			
		}				
		return isOverflow;
	}
	
}
