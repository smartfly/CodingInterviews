package chapter6_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author public
 *0,1,2……,n-1这个n个数字排成一个圆圈，从数字0开始每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字
 *经典解法：用环形链表模拟圆圈
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
			
			list.remove(current);//删除当前元素
			
			if (current == list.size()) {
				current = 0;
			}
			
		}
		
		return list.get(0);
		
	}
	
}
