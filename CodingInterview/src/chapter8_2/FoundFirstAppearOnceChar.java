package chapter8_2;

/**
 * @author public
 * 问题描述：
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如：当从字符流中只读出前两个字符"go"时,第一个只出现一次的字符是'g'。当从该字符流中读出前六个字符"google"时，第一个只出现一次的字符是'l'.
 */
public class FoundFirstAppearOnceChar {

	public char getFirstAppearOnceChar(String str){
		
		char ch = ' ';
		
		if (str == null || str.length() == 0) {
			return ch;
		}
		
		char[] chars = str.toCharArray();
		CharStatistic charStatistic = new CharStatistic();
		//初始化
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
	 * 内部类
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
			if (occurrence[ch] == -1) {//第一次
				occurrence[ch] = index;
			}else if (occurrence[ch] >= 0) {//表示有重复
				occurrence[ch] = -2;
			}
			index++;
		}
		
	}	
	
}
