package chapter6_5;

/**
 * @author public
 *��1+2+����+n,Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж����(A?B:C)
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
