package chapter6_5;

public class AddByBitOperator {

	public int add(int a, int b){
		int Sum = 0;
		int Carry = 0;
		
		do {			
			Sum = a ^ b;			
			Carry = (a & b) << 1;
			
			a = Sum;
			b = Carry;
			
		}while(b != 0);
		return a;		
	}
	
}
