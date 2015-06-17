package chapter2_4;

/**
 * @author public
 *面试题10：二进制中1的个数
 *思路：把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作
 */
public class CountOneOfBinaryNumber {

	public int count(int number){
		int count = 0;

		while (number != 0) {
			number = (number-1) & number;
			count++;
		}
		
		return count;
		
	}
	
}
