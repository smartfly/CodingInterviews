package chapter8_6;

/**
 * @author public
 * ���������������˵��˶���Χ
 * ������һ��m��n�еķ���һ�������˴�����(0,0)�ĸ��ӿ�ʼ�ƶ�����ÿһ�ο��������ҡ��ϡ����ƶ�һ�񣬵����ܽ�������������������λ֮�ʹ���k�ĸ���
 * ���磺��kΪ18ʱ���������ܹ����뷽��(35,37),��Ϊ3+5+3+7=18.�����ܽ��뷽��(35,38),��Ϊ3+5+3+8=19.
 * ���ʸû������ܹ�������ٸ��ӣ�
 *
 */
public class MovingCount {

	public int getCount(int threshold, int rows, int cols){
		
		int count = 0;
		
		if (rows < 1 || cols < 1 || threshold < 0) {
			return count;
		}
		
		boolean[] visited = new boolean[rows*cols];
		
		count = movingCountCore(threshold, rows, cols, 0, 0, visited);
		
		return count;
		
	}

	private int movingCountCore(int threshold, int rows, int cols, int row,
			int col, boolean[] visited) {
		int count = 0;
		if (Check(threshold, rows, cols, row, col, visited)) {
			visited[cols*row+col] = true;
			count = 1 + movingCountCore(threshold, rows, cols, row-1, col, visited)//up
						+movingCountCore(threshold, rows, cols, row+1, col, visited)//down
						+movingCountCore(threshold, rows, cols, row, col-1, visited)//left
						+movingCountCore(threshold, rows, cols, row, col+1, visited);//right
		}
		
		return count;
	}

	private boolean Check(int threshold, int rows, int cols, int row, int col,
			boolean[] visited) {
		if (row >= 0 && row < rows && col >= 0 && col < cols 
				&& (getNumber(col) + getNumber(row)) <= threshold 
				&& !visited[cols*row+col]) {
			return true;
		}
		return false;
	}

	private int getNumber(int col) {
		// TODO Auto-generated method stub
		int Sum = 0;
		while (col > 0) {
			Sum += col % 10;
			col = col / 10;
		}		
		return Sum;
	}
	
}
