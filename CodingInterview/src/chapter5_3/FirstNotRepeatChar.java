package chapter5_3;

/**
 * @author public
 *在字符串中找出第一个只出现一次的字符。
 */
public class FirstNotRepeatChar {

	public char getFirstNotRepeatChar(String input){
		if (input == null || input.length() == 0) {
			return '0';
		}
		
		char[] chars = input.toCharArray();
		int index = -1;
		
		for (int i = 0; i < chars.length; i++) {
			
			boolean isRepeat = false;
			int j = i+1;
			
			while (j < chars.length) {
				
				if (chars[i] == chars[j]) {
					isRepeat = true;
					break;
				}
				j++;
			}
			
			if (!isRepeat) {
				index = i;
				break;
			}
			
		}
		
		if (index == -1) {
			return '0';
		}
		
		return chars[index];
	}
	
}
