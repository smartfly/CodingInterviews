package chapter6_3;

/**
 * @author public
 *����һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣
 *Ϊ������������ź���ͨ��ĸһ������
 *����:�����ַ���"I am a student.",�����"student. a am I"
 */
public class ReverseSentence {

	public String getReserveSentence(String input){
		
		if (input == null || input.length() == 0) {
			return input;
		}
		
		input = Reserve(input);
		
		String[] strs = input.split(" ");
		
		if (strs.length == 0) {//��ֹȫ�ո����
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
