package chapter6_4;

/**
 * @author public
 *基于循环求骰子点数，时间性能好！
 */
public class PrintProbabilityByCycle {
	
	int MaxValue = 6;
	int[] Probability1, Probability2;
	boolean flag = false;
	public void PrintProbability(int n){
		
		if (n < 1) {
			return;
		}
		
		int MaxSum = n*MaxValue;		
		Probability1 = new int[MaxSum-n+1];
		Probability2 = new int[MaxSum-n+1];
		
		for (int i = 1; i <= n; i++) {			
			if (i == 1) {
				for (int j = 1; j <= MaxValue; j++) {
					Probability1[j-i]++;
				}
			}else {
				if (!flag) {
					for (int j = i; j <= i*MaxValue; j++) {
						Probability2[j-i] = 0;
						for (int m = 0; m < MaxValue && (j-i-m) >= 0; m++) {
							Probability2[j-i] += Probability1[j-i-m];						
						}					
					}
					flag = true;
				}else {
					for (int j = i; j <= i*MaxValue; j++) {
						Probability1[j-i] = 0;
						for (int m = 0; m < MaxValue && (j-i-m) >= 0; m++) {
							Probability1[j-i] += Probability2[j-i-m];						
						}					
					}
					flag = false;
				}				
			}			
		}
		
		double total = Math.pow(MaxValue, n);
		if (flag) {
			for (int i = n; i <= n*MaxValue; i++) {
				System.out.println(i+":"+Probability2[i-n]/total+":"+Probability2[i-n]);			
			}
		}else {
			for (int i = n; i <= n*MaxValue; i++) {
				System.out.println(i+":"+Probability1[i-n]/total+":"+Probability1[i-n]);			
			}
		}
		
		
	}
}
