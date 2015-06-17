package chapter3_3;

/**
 * @author public
 *具体的策略类
 */
public class isEven extends Operation{

	@Override
	public boolean getResult(int n) {
		// TODO Auto-generated method stub
		return (n & 0x1) == 0;
	}

}
