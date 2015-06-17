package chapter8_6;

/**
 * @author public
 * 问题描述：矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中任意一个格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如在下面的3*4的矩阵中包含一条字符串"bcced",
 * 但矩阵中不包含字符串"abcb"的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子后，路径不能在再次进入这个格子
 * a b c e
 * s f c s
 * a d e e
 */
public class PathInMatrix {
	
	public boolean hasPath(char[] matrix, int rows, int cols, String path){
		
		if (matrix == null || matrix.length == 0 || rows < 1 || cols < 1 || path == null) {// invalid input
			return false;
		}
		
		boolean[] visited = new boolean[rows*cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPathCore(matrix, rows, cols, i, j, path, 0, visited)) {
					return true;
				};
			}
		}
		
		return false;		
	}

	private boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col,
			String path, int index, boolean[] visited) {
		
		if (index == path.length()) {
			return true;
		}
		
		boolean hasPath = false;
		
		if (row >= 0 && col >= 0 && row < rows && col < cols 
				&& !visited[cols*row + col] && matrix[cols*row + col] == path.charAt(index)) {
			index++;
			visited[cols*row + col] = true;
			hasPath = hasPathCore(matrix, rows, cols, row-1, col, path, index, visited) || //up
					hasPathCore(matrix, rows, cols, row+1, col, path, index, visited) || //down
					hasPathCore(matrix, rows, cols, row, col-1, path, index, visited) || //left
					hasPathCore(matrix, rows, cols, row, col+1, path, index, visited);	//right			
			
			if (!hasPath) {//back
				index--;
				visited[cols*row + col] = false;
			}
			
		}
		return hasPath;
	
	}
	
}
