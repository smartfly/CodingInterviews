package chapter4_4;

/**
 * @author public
 *输入一个字符串，打印出该字符串的所有排列
 */
public class Permutation {

	public void printAllPermutation(String str) {
		
		if (str == null || str.length() == 0) {
			return;
		}
		
		char[] chars = str.toCharArray();
		print(chars, 0);
	}

	private void print(char[] chars, int i) {
		// TODO Auto-generated method stub
		
		if (i == chars.length-1) {
			for (int j = 0; j < chars.length; j++) {
				System.out.print(chars[j]+" ");
			}
			System.out.println();
		}else {
			for (int j = i; j < chars.length; j++) {
				//exchange
				char tmp = chars[i];
				chars[i] = chars[j];
				chars[j] = tmp;
				
				print(chars, i+1);
				
				//recovery
				tmp = chars[i];
				chars[i] = chars[j];
				chars[j] = tmp;				
			}
		}		
		
	}
	
}
