package chapter6_4;

/**
 * @author public
 *把n个骰子扔在地上，所有骰子朝上一面的点数之和为s,输入n,打印出s的所有可能的值出现的概率
 *基于递归求骰子点数，时间效率不够高
 */
public class PrintProbability {
	
	int MaxValue = 6;
	int[] Probability;
	
	public void PrintAllProbability(int n){
		
		if (n < 1) {
			return;
		}
		
		int MaxSum = n*MaxValue;
		
		Probability = new int[MaxSum - n + 1];
		
		for (int i = 1; i <= MaxValue; i++) {
			Probability(n, n, i);
		}
		
		double total = Math.pow(MaxValue, n);
		
		for (int i = n; i <= MaxSum; i++) {
			System.out.println(i+":"+(double)(Probability[i-n])/total+"-"+Probability[i-n]);;
		}
		
	}

	private void Probability(int original, int current, int sum) {
		// TODO Auto-generated method stub
		
		if (current == 1) {
			Probability[sum - original]++;
		}else {
			for (int j = 1; j <= MaxValue; j++) {
				Probability(original, current-1, sum+j);
			}
		}		
		
	}
}
