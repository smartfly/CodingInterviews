package chapter6_3;

/**
 * @author public
 *输入一个英文句子，翻转句子中单词的顺序，但单词类字符的顺序不变。
 *为简单起见，标点符号和普通字母一样处理。
 *例如:输入字符串"I am a student.",则输出"student. a am I"
 */
public class ReverseSentence {

	public String getReserveSentence(String input){
		
		if (input == null || input.length() == 0) {
			return input;
		}
		
		input = Reserve(input);
		
		String[] strs = input.split(" ");
		
		if (strs.length == 0) {//防止全空格情况
			return input;
		}
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = Reserve(strs[i]);
		}
		String tmp = "";
		for (int i = 0; i < strs.length; i++) {
			if (i == strs.length-1) {
				tmp += strs[i];
			}else {
				tmp += strs[i]+" ";
			}						
		}		
		return tmp;
		
	}

	private String Reserve(String input) {
		// TODO Auto-generated method stub
		char[] chars = input.toCharArray();
		int startIndex = 0;
		int endIndex = input.length()-1;
		
		while (startIndex < endIndex) {
			char tmp = chars[startIndex];
			chars[startIndex] = chars[endIndex];
			chars[endIndex] = tmp;
			startIndex++;
			endIndex--;
		}
		String tmp = "";
		for (int i = 0; i < chars.length; i++) {
			tmp += chars[i];
		}
		
		return tmp;
	}
	
	
	
}
