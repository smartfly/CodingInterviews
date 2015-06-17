package chapter8_5;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author public
 * �����������������ڵ����ֵ
 * ����һ������ͻ������ڵĴ�С�����ҳ����л�������������ֵ��
 * ���磬�����������{2��3��4��2��6��2��5��1}���������ڶԵĴ�С3����ôһ������6����������
 * ���ǵ����ֵ�ֱ�Ϊ{4��4��6��6��6��5}
 */
public class MaxInWindows {

	private ArrayDeque<Integer> deque;
	private ArrayList<Integer> result;
	
	public ArrayList<Integer> findMaxInWindows(ArrayList<Integer> list, int WindowSize){
		
		deque = new ArrayDeque<Integer>();//����list�б���±�
		result = new ArrayList<Integer>();//����ÿ�����ڵ����ֵ
		
		if (list == null || list.size() == 0 || WindowSize <= 0 || list.size() < WindowSize) {
			return list;
		}
		
		for (int i = 0; i < WindowSize; i++) {
			while (!deque.isEmpty() &&  list.get(deque.getLast()) <= list.get(i)) {
				deque.pollLast();//ɾ�����һ��Ԫ��
			}
			deque.add(i);
		}
		
		result.add(list.get(deque.getFirst()));
		
		for (int i = WindowSize; i < list.size(); i++) {
			
			while (!deque.isEmpty() && list.get(deque.getLast()) <= list.get(i)) {
				deque.pollLast();
			}
			
			if (!deque.isEmpty() && (deque.getFirst() <= (i-WindowSize))) {
				deque.poll();//ɾ����һ��Ԫ��
			}
			
			deque.add(i);
			result.add(list.get(deque.getFirst()));
		}
		
		return result;
		
	}
	
}
