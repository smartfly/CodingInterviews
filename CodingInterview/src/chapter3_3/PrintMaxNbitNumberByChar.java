package chapter3_3;

/**
 * @author public
 *���ַ�����ģ�����ּӷ��Ľⷨ��
 *1.���ַ�������������ģ��ӷ�
 *2.���ַ������ʽ�����ִ�ӡ����
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
	 * ɾ������ǰ����Ч��0.
	 * ���磺��098���98
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
	 * ��1����
	 */
	private boolean Increment(char[] chars) {
		// TODO Auto-generated method stub
		boolean isOverflow = false;
		int nTakeOver = 0;
		int nLength = chars.length; 
		
		for (int i = nLength-1; i >= 0; i--) {
			
			int nSum = chars[i] - '0' +nTakeOver;
			
			if (i == nLength-1) {//ĩβ��1
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
