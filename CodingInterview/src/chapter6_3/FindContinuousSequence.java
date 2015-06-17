package chapter6_3;

/**
 * @author public
 *����һ������s,��ӡ�����к�Ϊs��������������(���ٺ���������)��
 *����:����15,����1+2+3+4+5=4+5+6=7+8=15,���Խ����ӡ��3����������1~5��4~6��7~8
 */
public class FindContinuousSequence {

	public void FindContinuousSequenceSum(int sum){
		
		if (sum < 3) {//���ٺ���������
			return;
		}
		
		int smallIndex = 1;
		int bigIndex = 2;
		int mid = (sum + 1) >> 1;
		int ConSum = smallIndex + bigIndex;
		
		while (smallIndex < mid) {
			
			if (ConSum == sum) {
				PrintContinuousSequence(smallIndex, bigIndex);				
			}
			
			while (ConSum > sum) {
				ConSum -= smallIndex;
				smallIndex++;
				
				if (ConSum == sum) {
					PrintContinuousSequence(smallIndex, bigIndex);
				}
			}
			
			bigIndex++;
			ConSum += bigIndex;
						
		}
		System.out.println();
	}

	private void PrintContinuousSequence(int smallIndex, int bigIndex) {
		// TODO Auto-generated method stub
		System.out.println(smallIndex+"~"+bigIndex);
	}
	
}
