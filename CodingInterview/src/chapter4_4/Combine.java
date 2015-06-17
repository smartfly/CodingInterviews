package chapter4_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 * ���a��b��c������ϣ�a��b��c��ab��bc��ac��abc
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
			//��ϰ�����ǰԪ��
			list.add(str.charAt(0)+"");
			PrintAllCombine(str.substring(1, str.length()), m-1, list);
			list.remove(list.size()-1);
			//��ϲ�������ǰԪ��
			PrintAllCombine(str.substring(1, str.length()), m, list);
		}
		
	}
	
}
