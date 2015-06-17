package chapter8_2;

/**
 * @author public
 * 问题描述：
 * 请实现一个函数用来判断字符串是否表示数值(包括整数和小数)。
 * 例如，字符串"+100"、"5e2"、"-123"、"3.1416"及"-1E-16"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是
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
		//整数部分
		while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
			index++;
		} 
		
		if (index < chars.length) {//小数部分
			if (chars[index] == '.') {
				index++;
				while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
					index++;
				}
			}
		}
		
		if (index < chars.length) {//指数部分
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
