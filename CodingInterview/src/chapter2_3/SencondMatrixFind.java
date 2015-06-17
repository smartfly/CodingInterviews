package chapter2_3;

public class SencondMatrixFind {
	private boolean find = false;
	
	public boolean Find(int[] values, int rows, int columns, int findValue) {
		
		if (values !=null && columns>0 && rows > 0) {
			if (values[columns-1] == findValue) {
				find =true;
			}
			
			if (values[columns-1] > findValue) {//É¾³ýÁÐ
				int[] temp = new int[rows*(columns-1)];
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns-1; j++) {
						temp[i*(columns-1)+j]=values[i*columns+j];
					}
				}
				Find(temp, rows, columns-1, findValue);
			}
			
			if (values[columns-1] < findValue) {//É¾³ýÐÐ
				int[] temp = new int[(rows-1)*columns];
				for (int i = 1; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						temp[(i-1)*columns+j]=values[i*columns+j];
					}
				}
				Find(temp, rows-1, columns, findValue);
			}
		}
				
		return find;
	}
	
}
