package chapter8_2;

/**
 * @author public
 * 问题描述：
 * 请实现一个函数用来匹配包含'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次(含0次)
 * 在本题中，匹配是指字符串的所有字符匹配整个模式.例如,字符串"aaa"与模式"a.a"和"ab*ac*a"匹配
 * 但与"aa.a"及"ab*a"均不匹配.
 */
public class RegularExpress {

	public boolean match(String a, String b){
		
		if (a == null || b == null 
				|| a.length() == 0 || b.length() == 0 ) {
			return false;
		}
		
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();		
		
		return MatchCore(aChars, bChars, 0, 0);
	}

	private boolean MatchCore(char[] aChars, char[] bChars, int aIndex, int bIndex) {
		// TODO Auto-generated method stub
		
		if (aIndex == aChars.length && bIndex == bChars.length) {
			return true;
		}
		
		if (aIndex != aChars.length && bIndex == bChars.length) {
			return false;
		}
		
		if ((bIndex < bChars.length-1) && bChars[bIndex+1] == '*') {
			if ((aIndex < aChars.length) && (aChars[aIndex] == bChars[bIndex]) 
					|| (bChars[bIndex] == '.' && aIndex < aChars.length)) {
				return MatchCore(aChars, bChars, aIndex+1, bIndex) // stay current state
						|| MatchCore(aChars, bChars, aIndex, bIndex+2)//ignore a* 
						|| MatchCore(aChars, bChars, aIndex+1, bIndex+2);// go to next state(注：感觉可以忽略)
			}else {
				return MatchCore(aChars, bChars, aIndex, bIndex+2);//ignore a*
			}
		}
		
		if ((aIndex < aChars.length) && (aChars[aIndex] == bChars[bIndex]) 
				|| (bChars[bIndex] == '.' && aIndex < aChars.length)) {
			return MatchCore(aChars, bChars, aIndex+1, bIndex+1);
		}
		
		return false;
	}
	
}
