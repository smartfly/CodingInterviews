package chapter4_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 *���a��b��c������ϣ�a��b��c��ab��bc��ac��abc
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
		if (m > chars.length-start) {//start + m > chars.length��������Ҫ��
			return;
		}
		
		if (m == 0) {
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i)+" ");
			}
			System.out.println();
		}else if (m > 0) {
			//����ϰ�����ǰԪ��
			result.add(chars[start]);
			PrintAllCombine(chars, m-1, start+1, result);
			result.remove(result.size()-1);
			//����ϲ�������ǰԪ��
			PrintAllCombine(chars, m, start+1, result);
		}
	}
}
