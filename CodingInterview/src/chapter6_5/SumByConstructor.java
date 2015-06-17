package chapter6_5;

/**
 * @author public
 *求1+2+……+n,要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句(A?B:C)
 */
public class SumByConstructor {

	static int N = 0;
	static int Sum = 0;
	
	public SumByConstructor() {
		// TODO Auto-generated constructor stub
		N++;
		Sum += N;
	}
	
	public void Reset(){
		N = 0;
		Sum = 0;
	}
	
	public static int getSum(){
		return Sum;
	}
	
}
