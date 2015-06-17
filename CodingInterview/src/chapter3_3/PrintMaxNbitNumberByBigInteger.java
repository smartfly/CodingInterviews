package chapter3_3;

import java.math.BigInteger;

/**
 * @author public
 *��ӡ1������nλ����������Ϊ3�����ӡ1����2��3��������999
 */
public class PrintMaxNbitNumberByBigInteger {

	public void Print(int n){
		
		if (n < 0) {//��֤�Ϸ���
			return;
		}
		
		BigInteger number = BigInteger.ONE;
		BigInteger radix = new BigInteger("10");
		
		while (n>0) {
			number = number.multiply(radix);
			n--;
		}
		
		BigInteger tmp = BigInteger.ZERO;
		while (number.compareTo(BigInteger.ONE) > 0) {
			tmp = tmp.add(BigInteger.ONE);
			System.out.println(tmp);
			number = number.subtract(BigInteger.ONE);
		}
		
	}
	
}
