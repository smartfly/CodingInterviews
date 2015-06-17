package chapter8_2;

/**
 * @author public
 * ����������
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磺�����ַ�����ֻ����ǰ�����ַ�"go"ʱ,��һ��ֻ����һ�ε��ַ���'g'�����Ӹ��ַ����ж���ǰ�����ַ�"google"ʱ����һ��ֻ����һ�ε��ַ���'l'.
 */
public class FoundFirstAppearOnceChar {

	public char getFirstAppearOnceChar(String str){
		
		char ch = ' ';
		
		if (str == null || str.length() == 0) {
			return ch;
		}
		
		char[] chars = str.toCharArray();
		CharStatistic charStatistic = new CharStatistic();
		//��ʼ��
		for (int i = 0; i < chars.length; i++) {
			charStatistic.Insert(chars[i]);
		}
		
		int minIndex = 255;
		for (int i = 0; i < 256; i++) {
			if (charStatistic.occurrence[i] >= 0) {
				if (minIndex > charStatistic.occurrence[i]) {
					minIndex = charStatistic.occurrence[i];
					ch = (char)i;
				}				
			}
		}
		
		return ch;		
	}
	
	
	/**
	 * @author public
	 * �ڲ���
	 */
	class CharStatistic{
		
		private int[] occurrence = new int[256];
		private int index = 0;
		
		public CharStatistic() {
			for (int i = 0; i < occurrence.length; i++) {
				occurrence[i] = -1;
			}
		}
		
		void Insert(char ch){
			if (occurrence[ch] == -1) {//��һ��
				occurrence[ch] = index;
			}else if (occurrence[ch] >= 0) {//��ʾ���ظ�
				occurrence[ch] = -2;
			}
			index++;
		}
		
	}	
	
}
