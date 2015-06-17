package chapter8_2;

/**
 * @author public
 * ����������
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��
 * ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ��������(��0��)
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ.����,�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ��
 * ����"aa.a"��"ab*a"����ƥ��.
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
						|| MatchCore(aChars, bChars, aIndex+1, bIndex+2);// go to next state(ע���о����Ժ���)
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
