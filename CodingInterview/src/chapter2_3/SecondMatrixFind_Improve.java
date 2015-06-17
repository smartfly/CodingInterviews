package chapter2_3;

public class SecondMatrixFind_Improve {
	
	public boolean Find(int[] values, int rows, int columns, int findValue) {
		// TODO Auto-generated method stub
		boolean find = false;
		while (values != null && rows > 0 && columns >0) {
			int row = 0;
			int column = columns-1;
			
			if (values[row*columns+column]==findValue) {
				find = true;
				break;
			}else if (values[row*columns+column] > findValue) {
				column--;
			}else {
				row++;
			}
		}
		return find;
	}
}
