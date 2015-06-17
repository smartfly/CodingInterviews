package chapter4_2;

/**
 * @author public
 *顺时针打印矩阵
 */
public class PrintMatrixClockwise {

	public void MatrixClockwise(int[] A, int rows, int columns){
		
		if (A == null || A.length == 0 || rows <= 0 || columns <= 0) {
			return;
		}
		
		int start = 0;
		while ((columns > 2*start) && (rows > 2*start)) {
			PrintMatrix(A, rows, columns, start);
			start++;
		}
		
	}

	private void PrintMatrix(int[] a, int rows, int columns, int start) {
		// TODO Auto-generated method stub
		int endX = columns-start-1;//终止列
		int endY = rows-start-1 ;//终止行
		//从左到右
		for (int i = start; i <= endX; i++) {
			System.out.print(a[start*columns+i]+" ");
		}
//		if (start <= endX) {
//			for (int i = 0; i <= endX - start; i++) {
//				System.out.print(a[start*columns+start+i]+" ");
//			}
//		}
		//从上到下
		if (start < endY) {
			for (int i = 1; i <= endY-start; i++) {
				System.out.print(a[columns*(start+i)+endX]+" ");
			}
		}
		//从右到左
		if (start < endY && start < endX) {
			for (int i = 1; i <= endX -start; i++) {
				System.out.print(a[columns*endY+endX-i]+" ");
			}
		}
		//从下到上
		if (start < endY && (start < endX -1)) {
			for (int i = 1; i < endY - start; i++) {
				System.out.print(a[columns*(endY-i)+start]+" ");
			}
		}
	}
	
}
