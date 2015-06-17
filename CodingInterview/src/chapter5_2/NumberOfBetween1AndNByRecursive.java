package chapter5_2;

public class NumberOfBetween1AndNByRecursive {

	public int getNumber1(int n){
		
		char[] chars = String.valueOf(n).toCharArray();
		
		return NumberOf1(chars, 0);
	}

	private int NumberOf1(char[] chars, int start) {
		// TODO Auto-generated method stub
		
		if (start > chars.length-1) {
			return 0;
		}
		
		int first = chars[start] - '0';
		int length = chars.length-start;
		
		if (length == 1 && first == 0) {
			return 0;
		}
		
		if (length == 1 && first > 0) {
			return 1;
		}
		
		//假设n=21345
		//numFirst是数字10000~19999的第一个位的数目
		int numFirst = 0;
		if (first > 1) {
			numFirst = PowerBase10(length-1);
		}else if (first == 1) {
			numFirst = Integer.valueOf(CharsToString(chars, start+1))+1;
		}
		
		//NumOther是1346~21345除了第一位之外的数位中的数目
		int numOther = first*(length-1)*PowerBase10(length-2);
		//numRecursive是1~1345中的数目
		int numRecursive = NumberOf1(chars, start+1);
		
		return numFirst+numOther+numRecursive;
	}

	private String CharsToString(char[] chars, int start) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = start; i < chars.length; i++) {
			str += chars[i];
		}
		return str;
	}

	private int PowerBase10(int length) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 0; i < length; i++) {
			result *= 10;
		}
		return result;
	}
	
}
