package chapter8_2;

/**
 * @author public
 * ����������
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ(����������С��)��
 * ���磬�ַ���"+100"��"5e2"��"-123"��"3.1416"��"-1E-16"����ʾ��ֵ��
 * ��"12e"��"1a3.14"��"1.2.3"��"+-5"��"12e+5.4"������
 */
public class IsNumeric {

	public boolean StrIsNumeric(String string){
		
		if (string == null || string.length() == 0) {
			return false;
		}		
		char[] chars = string.toCharArray();
		int index = 0;
		if (chars[index] == '+' || chars[index] == '-') {
			index++;
		}
		if (index != chars.length) {
			return IsNumericCore(chars, index);
		}
		return false;		
	}

	private boolean IsNumericCore(char[] chars, int index) {
		// TODO Auto-generated method stub
		boolean isNumeric = true;
		//��������
		while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
			index++;
		} 
		
		if (index < chars.length) {//С������
			if (chars[index] == '.') {
				index++;
				while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
					index++;
				}
			}
		}
		
		if (index < chars.length) {//ָ������
			if (chars[index] == 'e' || chars[index] == 'E') {
				index++;
				if (chars[index] == '+' || chars[index] == '-') {
					index++;
				}
				if (index != chars.length) {
					while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
						index++;
					} 
				}else {
					isNumeric = false;
				}
			}
		}
		
		
		return isNumeric && index == chars.length;
	}
	
}
