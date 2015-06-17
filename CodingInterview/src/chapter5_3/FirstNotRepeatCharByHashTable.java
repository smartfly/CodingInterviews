package chapter5_3;

import java.util.Hashtable;

/**
 * @author public
 *通过哈希表完成字符串的字符统计，然后在hashtable里寻找第一个只出现一次的字符
 */
public class FirstNotRepeatCharByHashTable {

	public char FirstNotRepeatChar(String input){
		
		Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
		
		if (input == null || input.length() == 0) {
			return '0';
		}
		
		char[] chars = input.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			
			if (hashtable.containsKey(chars[i])) {
				int count = hashtable.get(chars[i]);
				hashtable.put(chars[i], count+1);
			}else {
				hashtable.put(chars[i], 1);
			}
			
		}
			
		for (Character character : chars) {
			if (hashtable.get(character)==1) {
				return character;
			}
		}		
		
		return '0';
		
	}
	
}
