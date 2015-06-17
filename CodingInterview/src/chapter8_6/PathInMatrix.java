package chapter8_6;

/**
 * @author public
 * ���������������е�·��
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ���������һ����ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ��
 * ���һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ������������3*4�ľ����а���һ���ַ���"bcced",
 * �������в������ַ���"abcb"��·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ������Ӻ�·���������ٴν����������
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
