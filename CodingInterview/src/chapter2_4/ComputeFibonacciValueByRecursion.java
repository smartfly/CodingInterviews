package chapter2_4;

/**
 * @author public
 *递归实现斐波那契数列
 */
public class ComputeFibonacciValueByRecursion {

	public int ComputeValue(int n){
		
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return ComputeValue(n-1)+ComputeValue(n-2);
		
	}
	
}
