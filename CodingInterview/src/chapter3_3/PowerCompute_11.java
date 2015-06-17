package chapter3_3;

/**
 * @author public
 *实现函数double Power(double base, int exponent),求base的exponent次方。不得使用库函数，同时不需要考虑大数问题
 */
public class PowerCompute_11 {
	
	boolean InvaliadInput = false;
	
	public double Compute(double base, int exponent){
		
		if (isEquals(base, 0.0) && exponent <= 0) {
			InvaliadInput = true;
			return 0.0;
		}
		
		if (exponent < 0) {
			exponent = -exponent;
		}
		
		double result = PowerWithAbsExponent(base, exponent);
		
		
		if (exponent < 0) {
			result = 1.0/result;
		}
		
		return result;
		
	}

	/**
	 * @param base
	 * @param exponent
	 * @return
	 * 高效的解法
	 */
	private double PowerWithAbsExponent(double base, int exponent) {
		// TODO Auto-generated method stub
		if (exponent == 0) {
			return 1.0;
		}
		
		if (exponent == 1) {
			return base;
		}
		
		double result = PowerWithAbsExponent(base, exponent>>1);
		result *= result; 
		
		if ((exponent & 0x1) == 1) {//判断exponet是否奇数
			return base*result;
		}
		
		return result;
	}
	
	/**
	 * @param base
	 * @param exponent
	 * @return
	 * 普通方法
	 */
//	private double PowerWithAbsExponent(double base, int exponent) {
//		// TODO Auto-generated method stub
//		double result = 1.0;
//		for (int i = 0; i < exponent; i++) {
//			result *=base;
//		}
//		return result;
//	}

	/**
	 * judge double of num1 and num2 is equal
	 * @param num1
	 * @param num2
	 * @return
	 */
	private boolean isEquals(double num1, double num2) {
		// TODO Auto-generated method stub
		if ((num1-num2) > -0.000001 && (num1-num2) < 0.000001) {
			return true;
		}
		return false;
	}
	
}
