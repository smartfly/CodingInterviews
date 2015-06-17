package chapter7_1;

/**
 * @author public
 * 问题描述
 * 把字符串转化为整数
 * 例如："-12"转化为-12
 * 注:在getInt函数返回为-1且Invalid = true表示输入不合法,而getInt函数返回为-1且Invalid = false表示-1
 * 整数溢出问题：int范围为：0x80000000~0x7fffffff(-2147483648~2147483647)
 * 
 */
public class StrToInt {

	boolean Invalid = false;
	boolean minus = false;
	
	public int getInt(String str){
		
		int number = -1;
		
		if (str == null || str.length() == 0) {//防止字符串为null和空字符串""
			Invalid = true;
			return number;
		}
		
		char[] chars = str.toCharArray();//string to char array
		int index = 0;
		
		//防止字符串为"+"、"-"和" "情况
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
				
				if ((!minus && number > 0x7fffffff) //防止整数溢出问题
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
