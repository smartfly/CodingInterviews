package chapter5_3;

/**
 * @author public
 *我们把包含因子2、3和5的数称作丑数(Ugly Number).求按从小到大的顺序的第1500个丑数
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
	 * 判断该数字是否是丑数
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
