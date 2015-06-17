package chapter8_5;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author public
 * 问题描述：滑动窗口的最大值
 * 给定一个数组和滑动窗口的大小，请找出所有滑动窗口里的最大值。
 * 例如，如果输入数组{2，3，4，2，6，2，5，1}及滑动窗口对的大小3，那么一共存在6个滑动窗口
 * 它们的最大值分别为{4，4，6，6，6，5}
 */
public class MaxInWindows {

	private ArrayDeque<Integer> deque;
	private ArrayList<Integer> result;
	
	public ArrayList<Integer> findMaxInWindows(ArrayList<Integer> list, int WindowSize){
		
		deque = new ArrayDeque<Integer>();//保存list列表的下标
		result = new ArrayList<Integer>();//保存每个窗口的最大值
		
		if (list == null || list.size() == 0 || WindowSize <= 0 || list.size() < WindowSize) {
			return list;
		}
		
		for (int i = 0; i < WindowSize; i++) {
			while (!deque.isEmpty() &&  list.get(deque.getLast()) <= list.get(i)) {
				deque.pollLast();//删除最后一个元素
			}
			deque.add(i);
		}
		
		result.add(list.get(deque.getFirst()));
		
		for (int i = WindowSize; i < list.size(); i++) {
			
			while (!deque.isEmpty() && list.get(deque.getLast()) <= list.get(i)) {
				deque.pollLast();
			}
			
			if (!deque.isEmpty() && (deque.getFirst() <= (i-WindowSize))) {
				deque.poll();//删除第一个元素
			}
			
			deque.add(i);
			result.add(list.get(deque.getFirst()));
		}
		
		return result;
		
	}
	
}
