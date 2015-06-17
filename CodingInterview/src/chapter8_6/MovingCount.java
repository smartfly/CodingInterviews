package chapter8_6;

/**
 * @author public
 * 问题描述：机器人的运动范围
 * 地上有一个m行n列的方格。一个机器人从坐标(0,0)的格子开始移动，它每一次可以向左、右、上、下移动一格，但不能进入行坐标和列坐标的数位之和大于k的格子
 * 例如：当k为18时，机器人能够进入方格(35,37),因为3+5+3+7=18.但不能进入方格(35,38),因为3+5+3+8=19.
 * 请问该机器人能够到达多少格子？
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
