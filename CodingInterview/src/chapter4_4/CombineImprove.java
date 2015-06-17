package chapter4_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 *输出a、b、c所有组合：a、b、c、ab、bc、ac、abc
 */
public class CombineImprove {
	
	public void PermutationCombine(String str){
		
		if (str == null && str.length() == 0) {
			return;
		}
		
		char[] chars = str.toCharArray();
		for (int i = 1; i <= chars.length; i++) {
			List<Character> result = new ArrayList<Character>();
			PrintAllCombine(chars, i, 0, result);
		}
	}

	private void PrintAllCombine(char[] chars, int m, int start,
			List<Character> result) {
		// TODO Auto-generated method stub		
		if (m > chars.length-start) {//start + m > chars.length：不符合要求
			return;
		}
		
		if (m == 0) {
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i)+" ");
			}
			System.out.println();
		}else if (m > 0) {
			//该组合包含当前元素
			result.add(chars[start]);
			PrintAllCombine(chars, m-1, start+1, result);
			result.remove(result.size()-1);
			//该组合不包含当前元素
			PrintAllCombine(chars, m, start+1, result);
		}
	}
}
