package chapter7_1;

/**
 * @author public
 * ��������
 * ���ַ���ת��Ϊ����
 * ���磺"-12"ת��Ϊ-12
 * ע:��getInt��������Ϊ-1��Invalid = true��ʾ���벻�Ϸ�,��getInt��������Ϊ-1��Invalid = false��ʾ-1
 * ����������⣺int��ΧΪ��0x80000000~0x7fffffff(-2147483648~2147483647)
 * 
 */
public class StrToInt {

	boolean Invalid = false;
	boolean minus = false;
	
	public int getInt(String str){
		
		int number = -1;
		
		if (str == null || str.length() == 0) {//��ֹ�ַ���Ϊnull�Ϳ��ַ���""
			Invalid = true;
			return number;
		}
		
		char[] chars = str.toCharArray();//string to char array
		int index = 0;
		
		//��ֹ�ַ���Ϊ"+"��"-"��" "���
		if (chars[index] == '+' 
				|| chars[index] == '-' 
				|| chars[index] == ' ') {
			
			if (chars[index] == '-') {
				minus = true;
			}			
			index++;			
		}
		
		if (index != chars.length) {
			number = StrToNumber(index, chars);
		}else {
			Invalid = true;
		}

		return number;		
	}

	private int StrToNumber(int index, char[] chars) {
		// TODO Auto-generated method stub
		long number = 0;
		
		for (int i = index; i < chars.length; i++) {
			if ((chars[i] >= '0') && (chars[i] <= '9')) {
				int flag = minus ? -1 : 1;
				number = number*10 + flag*(chars[i] - '0');
				
				if ((!minus && number > 0x7fffffff) //��ֹ�����������
						|| (minus && number < 0x80000000)) {
					number = -1;
					Invalid = true;
					break;
				}
				
			}else {
				number = -1;
				Invalid = true;
				break;
			}
			
		}		
		return (int)number;
	}
	
}
