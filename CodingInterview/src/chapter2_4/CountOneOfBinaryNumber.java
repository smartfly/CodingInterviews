package chapter2_4;

/**
 * @author public
 *������10����������1�ĸ���
 *˼·����һ��������ȥ1���ٺ�ԭ�����������㣬��Ѹ��������ұ�һ��1���0.��ôһ�������Ķ����Ʊ�ʾ���ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ���
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
