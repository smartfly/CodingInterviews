package chapter5_3;

/**
 * @author public
 *���ǰѰ�������2��3��5������������(Ugly Number).�󰴴�С�����˳��ĵ�1500������
 */
public class UglyNumberByCommon {

	public int getUglyNumber(int index){
		
		if (index < 0) {
			return 0;
		}
		
		int UglyNumber = 0;
		int number = 0;
		
		while (UglyNumber < index) {
			
			number++;			
			if (isUgly(number)) {
				UglyNumber++;
			}
		}
		
		return number;
		
	}

	/**
	 * @param number
	 * @return
	 * �жϸ������Ƿ��ǳ���
	 */
	private boolean isUgly(int number) {
		// TODO Auto-generated method stub
		
		while (number%2 == 0) {
			number = number/2;
		}
		
		while (number%3 == 0) {
			number = number/3;
		}
		
		while (number%5 == 0) {
			number = number/5;
		}
		
		return (number==1) ? true:false;
	}
	
	
}
