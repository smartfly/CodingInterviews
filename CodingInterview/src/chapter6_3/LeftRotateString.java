package chapter6_3;

/**
 * @author public
 *字符串的左旋转操作时把字符串前面的若干个字符串转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 *比如：输入字符串"abcdefg"和数字2,该函数将返回左旋转2位得到的结果"cdefgab"
 */
public class LeftRotateString {

	public String getLeftRotateStr(String input , int index){
		if (input == null || input.length() == 0) {
			return input;
		}
		
		String leftString = input.substring(0, index);
		String rightString = input.substring(index, input.length());
		String contact = Reserve(leftString)+Reserve(rightString);
		
		
		return Reserve(contact);
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
