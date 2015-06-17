package chapter6_4;

/**
 * @author public
 *使用映射方法可以推导出：
 *if n=1 then f(n,m)=0
 *if n>1 then f(n-1,m) =(f(n-1,m)+m)%n 
 */
public class LastRemainByInnovate {
	
	public int getLastRemainNumber(int n, int m){
		if (n < 1 || m < 1) {
			return -1;
		}
		
		int last = -1;
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				last = 0;
			}else {
				last = (last+m)%i;
			}
		}		
		
		return last;
	}
}
