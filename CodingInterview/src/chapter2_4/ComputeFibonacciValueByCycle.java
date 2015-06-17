package chapter2_4;

/**
 * @author public
 *循环实现斐波那契数列
 */
public class ComputeFibonacciValueByCycle {

	public int Compute(int n){

		int result1 = 0;
		int result2 = 1;
		int result = 0;
		
		if (n == 0) {
			return result1;
		}
		
		if (n == 1) {
			return result2;
		}
		
		for (int i = 2; i <= n; i++) {
			result = result1 + result2;
			result1 = result2;
			result2 = result;
		}
		return result;
	}
	
}
