package chapter3_3;

/**
 * @author public
 *����Ĳ�����
 */
public class isEven extends Operation{

	@Override
	public boolean getResult(int n) {
		// TODO Auto-generated method stub
		return (n & 0x1) == 0;
	}

}
