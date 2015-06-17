package chapter4_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 * 输出a、b、c所有组合：a、b、c、ab、bc、ac、abc
 *http://m.blog.csdn.net/blog/fengyueqq/20912917
 */
public class Combine {

	public void PermutationCombine(String str){
		
		if (str == null || str.length() == 0) {
			return;
		}
		
		
		for (int i = 1; i <= str.length(); i++) {
			List<String> list = new ArrayList<String>();
			PrintAllCombine(str, i, list);
		}
		
	}

	private void PrintAllCombine(String str, int m, List<String> list) {
		// TODO Auto-generated method stub		
		if (m == 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			return;
		}
		
		if (str.length() != 0) {
			//组合包含当前元素
			list.add(str.charAt(0)+"");
			PrintAllCombine(str.substring(1, str.length()), m-1, list);
			list.remove(list.size()-1);
			//组合不包含当前元素
			PrintAllCombine(str.substring(1, str.length()), m, list);
		}
		
	}
	
}
