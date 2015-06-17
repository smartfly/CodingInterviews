package chapter6_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 *0,1,2����,n-1���n�������ų�һ��ԲȦ��������0��ʼÿ�δ����ԲȦ��ɾ����m�����֡�������ԲȦ��ʣ�µ����һ������
 *����ⷨ���û�������ģ��ԲȦ
 */
public class LastRemain {

	List<Integer> list = new ArrayList<Integer>();
	
	public int getLastRemainNum(int n, int m){
		
		if (n < 1 || m < 1) {
			return -1;
		}
		
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		
		int current = 0;
		while (list.size() > 1) {
			
			for (int i = 1; i < m; i++) {
				current++;
				if (current == list.size()) {
					current = 0;
				}
			}
			
			list.remove(current);//ɾ����ǰԪ��
			
			if (current == list.size()) {
				current = 0;
			}
			
		}
		
		return list.get(0);
		
	}
	
}
