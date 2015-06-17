package chapter6_3;

/**
 * @author public
 *�ַ���������ת����ʱ���ַ���ǰ������ɸ��ַ���ת�Ƶ��ַ�����β�����붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ�
 *���磺�����ַ���"abcdefg"������2,�ú�������������ת2λ�õ��Ľ��"cdefgab"
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
